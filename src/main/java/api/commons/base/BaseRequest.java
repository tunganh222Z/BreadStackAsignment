package api.commons.base;


import api.commons.routese.Routes;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class BaseRequest {

    public static RequestSpecification getRequest(String baseURI){
        RequestSpecification request = given();
        return request
                .baseUri(baseURI)
                .contentType("application/json");
    }

    public static RequestSpecification getRequest(String baseURI, String queryParam, String queryValue){
        RequestSpecification request = given();
        return request
                .baseUri(baseURI)
                .contentType("application/json")
                .queryParam(queryParam, queryValue);
    }

    public static RequestSpecification postRequest(String baseURI, Object body){
        RequestSpecification request = given();
        return request
                .baseUri(baseURI)
                .contentType("application/json")
                .body(body);
    }
}
