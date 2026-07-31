
import models.lombok.RegistrationBodyLombokModel;
import models.lombok.RegistrationResponceLombokModel;
import models.pojo.RegistrationBodyPojoModel;
import models.pojo.RegistrationResponcePojoModel;
import net.datafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class RegistrationTests {

    String username;
    String password;

    @BeforeEach
    public void prepareTestData() {
        Faker faker = new Faker();
        username = faker.name().firstName();
        password = faker.name().firstName();

    }
    @Test
    public void successfulRegistrationTest() {

        String data = "{\"username\": \"" + username + "\", \"password\": \"" + password + "\"}";

        given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .body("username", is(username))
                .body("id", notNullValue());
    }

    @Test
    public void successfulRegistrationTest_with_pojo() {

        RegistrationBodyPojoModel data = new RegistrationBodyPojoModel();
       // RegistrationBodyPojoModel data = new RegistrationBodyPojoModel(username, password);
        data.setUsername(username);
        data.setPassword(password);


        RegistrationResponcePojoModel registrationResponce = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .as(RegistrationResponcePojoModel.class);

        assertEquals(username, registrationResponce.getUsername());
    }


    @Test
    public void successfulRegistrationTest_with_lombok() {

        RegistrationBodyLombokModel data = new RegistrationBodyLombokModel();

        //RegistrationBodyLombokModel data = new RegistrationBodyLombokModel(username, password);
        data.setUsername(username);
        data.setPassword(password);


        RegistrationResponceLombokModel registrationResponce = given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .extract()
                .as(RegistrationResponceLombokModel.class);

        assertEquals(username, registrationResponce.getUsername());
    }
    @Test
    public void existingUser400Test() {

        String data = String.format("{\"username\": \"%s\", \"password\": \"%s\"}", username, password);

        given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(201)
                .body("username", is(username))
                .body("id", notNullValue());

        given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .body("username[0]", is("A user with that username already exists."));
    }

    @Test
    public void invalidUsername400Test() {

        String data = String.format("{\"username\": \"%s\", \"password\": \"%s\"}", username, password);

        given()
                .log().all()
                .contentType(JSON)
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(400)
                .body("username", is(username))
                .body("id", notNullValue());
    }
    @Test
    public void unsupportedMediaType415Test() {

        String data = String.format("{\"username\": \"%s\", \"password\": \"%s\"}", username, password);

        given()
                .log().all()
                .body(data)
                .when()
                .post("http://bookclub.qa.guru:8100/api/v1/users/register/")
                .then()
                .log().all()
                .statusCode(415)
                .body("username", is(username))
                .body("id", notNullValue());
    }
}