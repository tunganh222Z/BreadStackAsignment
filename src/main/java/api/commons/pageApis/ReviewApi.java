package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.data.reviewData.ReviewData;
import api.commons.routese.Routes;
import io.restassured.response.Response;

public class ReviewApi extends BaseRequest {
    public Response createReview(ReviewData reviewData) {
        return postRequest(Routes.BASE_URI, reviewData)
                .when().post(Routes.REVIEWS);
    }
}
