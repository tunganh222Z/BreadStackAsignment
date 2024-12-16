package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.data.reviewData.ReviewData;
import api.commons.routese.Routes;
import io.qameta.allure.Step;
import io.restassured.response.Response;

public class ReviewApi extends BaseRequest {

    @Step("Post request to create review")
    public Response createReview(ReviewData reviewData) {
        return postRequest(Routes.BASE_URI, reviewData)
                .when().post(Routes.REVIEWS);
    }
}
