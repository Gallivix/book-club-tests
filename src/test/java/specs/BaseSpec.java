package specs;

import io.qameta.allure.restassured.AllureRestAssured;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;

import static allure.CustomAllureListener.withCustomTemplate;
import static io.restassured.RestAssured.with;
import static io.restassured.filter.log.LogDetail.ALL;
import static io.restassured.http.ContentType.JSON;

public class BaseSpec {

    public static RequestSpecification requestSpec = with()
            .filter(withCustomTemplate())
            .log().all()
            .contentType(JSON)
            .basePath("api/v1");

    public static ResponseSpecBuilder responseSpecBuilder() {
        return new ResponseSpecBuilder().log(ALL);
    }
}
