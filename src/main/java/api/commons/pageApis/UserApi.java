package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.data.UserData;
import api.commons.routese.Routes;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class UserApi extends BaseRequest {

    @Step("Post request to create user")
    public Response createUser(UserData userData) {
        return postRequest(Routes.BASE_URI, userData)
                .when().post(Routes.USERS);
    }

    @Step("Get userId from create User Response")
    public int getUserId(Response createUserResponse) {
        return createUserResponse.jsonPath().getInt("id");
    }
}
