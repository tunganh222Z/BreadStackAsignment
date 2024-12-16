package api.commons.base;

import api.commons.pageApis.*;

public class ApiFactory {
    private static ApiFactory instance;
    private CategoriesApi categoriesApi;
    private OrderApi orderApi;
    private ProductApi productApi;
    private ReviewApi reviewApi;
    private UserApi userApi;

    private ApiFactory() {
        this.categoriesApi = new CategoriesApi();
        this.orderApi = new OrderApi();
        this.userApi = new UserApi();
        this.reviewApi = new ReviewApi();
        this.productApi = new ProductApi();
    }

    public static ApiFactory getInstance() {
        if (instance == null) {
            instance = new ApiFactory();
        }
        return instance;
    }

    public CategoriesApi getCategoriesApi() {
        return categoriesApi;
    }

    public OrderApi getOrderApi() {
        return orderApi;
    }

    public ProductApi getProductApi() {
        return productApi;
    }

    public ReviewApi getReviewApi() {
        return reviewApi;
    }

    public UserApi getUserApi() {
        return userApi;
    }
}
