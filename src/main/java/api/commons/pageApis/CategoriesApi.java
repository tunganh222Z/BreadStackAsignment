package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.routese.Routes;
import io.restassured.response.Response;

public class CategoriesApi extends BaseRequest {
    public Response searchCategory(String value) {
        return getRequest(Routes.BASE_URI, "name" , value)
                .when().get(Routes.CATEGORIES);
    }
}
