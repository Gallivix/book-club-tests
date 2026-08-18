package tests;

import api.ApiClient;
import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeAll;

public class TestBase {

    protected static ApiClient apiClient;

    private static final String BASE_URL = "https://book-club.qa.guru";

    @BeforeAll
    public static void setUp() {
        RestAssured.baseURI = BASE_URL;
        apiClient = new ApiClient(BASE_URL);
    }
}
