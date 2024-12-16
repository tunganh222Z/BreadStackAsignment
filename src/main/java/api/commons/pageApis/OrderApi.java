package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.data.orderData.OrderData;
import api.commons.routese.Routes;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class OrderApi extends BaseRequest {

    @Step("Post request to place an order with order data")
    public Response placeAnOrder(OrderData orderData) {
        return postRequest(Routes.BASE_URI, orderData)
                .when().post(Routes.ORDERS);
    }
}
