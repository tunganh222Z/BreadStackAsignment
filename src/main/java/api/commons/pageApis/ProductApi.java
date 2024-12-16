package api.commons.pageApis;

import api.commons.base.BaseRequest;
import api.commons.routese.Routes;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import java.util.List;
import java.util.Map;

public class ProductApi extends BaseRequest {

    public Response searchProductByCategoryId(int categoryId) {
        return getRequest(Routes.BASE_URI, "categoryId", String.valueOf(categoryId))
                .when().get(Routes.PRODUCTS);
    }

    public int getProductIdByName(Response response, String productName) {
        int productId = 0;
        JsonPath jsonPath = new JsonPath(response.asString());
        List<Map<String, Object>> products = jsonPath.getList("$");

        for (Map<String, Object> product : products){
            if (productName.equals(product.get("name"))){
                productId = (int) product.get("id");
            }
        }
        return productId;
    }
}
