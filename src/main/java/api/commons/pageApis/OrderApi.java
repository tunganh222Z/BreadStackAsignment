package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.data.orderData.OrderData;
import api.commons.routese.Routes;
import io.restassured.response.Response;

public class OrderApi extends BaseRequest {
    public Response placeAnOrder(OrderData orderData) {
        return postRequest(Routes.BASE_URI, orderData)
                .when().post(Routes.ORDERS);
    }
}
