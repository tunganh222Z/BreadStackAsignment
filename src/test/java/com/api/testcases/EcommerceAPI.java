package com.api.testcases;

import api.commons.base.ApiFactory;
import api.commons.base.BaseTest;
import api.commons.data.UserData;
import api.commons.data.orderData.OrderData;
import api.commons.data.orderData.OrderItems;
import api.commons.data.reviewData.ReviewData;
import api.commons.pageApis.*;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class EcommerceAPI extends BaseTest {
    private UserApi userApi;
    private CategoriesApi categoriesApi;
    private ProductApi productApi;
    private OrderApi orderApi;
    private ReviewApi reviewApi;
    private ApiFactory apiFactory;

    private int categoryId, userId, productId, quantity,rating;
    private String userName, email, password;
    private String productName, comment;
    private ReviewData reviewData;
    private OrderData orderData;
    private UserData userData;


    @BeforeClass
    public void beforeClass(){
        apiFactory = ApiFactory.getInstance();
        userApi = apiFactory.getUserApi();

        userName = "TungAnh";
        email = "ztunganhbkz@gmail.com";
        password = "test123API";
        productName = "iPhone 13";
        quantity = 1;
        rating = 5;
        comment = "Great product";
    }
    @Test
    public void TC_01(){
        userData = new UserData(userName, email, password);
        Response createUserResponse = userApi.createUser(userData);

        createUserResponse.then().statusCode(201);

        userId = userApi.getUserId(createUserResponse);

        categoriesApi = apiFactory.getCategoriesApi();
    }

    @Test
    public void TC_02(){
        Response searchCategoryResponse = categoriesApi.searchCategory("Electronics");

        searchCategoryResponse.then().statusCode(200);

        categoryId = searchCategoryResponse.jsonPath().getInt("[0].id");

        productApi = apiFactory.getProductApi();

        Response searchProductResponse = productApi.searchProductByCategoryId(categoryId);

        productId = productApi.getProductIdByName(searchProductResponse, productName);

        orderData = new OrderData(userId, List.of(new OrderItems(productId,quantity)));

        orderApi = apiFactory.getOrderApi();

        Response placeAnOrderResponse = orderApi.placeAnOrder(orderData);

        placeAnOrderResponse.then().statusCode(201);
    }

    @Test
    public void TC_03(){
        reviewData = new ReviewData(userId, productId, rating, comment);

        reviewApi = apiFactory.getReviewApi();

        Response reviewResponse = reviewApi.createReview(reviewData);

        reviewResponse.then().statusCode(201);
    }
}
