package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.routese.Routes;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class CategoriesApi extends BaseRequest {

    @Step("Get category name with parameter {0}")
    public Response searchCategory(String value) {
        return getRequest(Routes.BASE_URI, "name" , value)
                .when().get(Routes.CATEGORIES);
    }
}
