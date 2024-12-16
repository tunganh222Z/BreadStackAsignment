package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.data.UserData;
import api.commons.routese.Routes;
import io.restassured.response.Response;

public class UserApi extends BaseRequest {
    public Response createUser(UserData userData) {
        return postRequest(Routes.BASE_URI, userData)
                .when().post(Routes.USERS);
    }

    public int getUserId(Response createUserResponse) {
        return createUserResponse.jsonPath().getInt("id");
    }
}
