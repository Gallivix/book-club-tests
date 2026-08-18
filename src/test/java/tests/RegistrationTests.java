package tests;

import models.registration.ExistingUserResponceModel;
import models.registration.SucessfulRegistrationResponceModel;
import net.datafaker.Faker;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.*;

public class RegistrationTests extends TestBase {

    String username;
    String password;

    @BeforeEach
    public void prepareTestData() {
        Faker faker = new Faker();
        username = faker.name().firstName() + "_" + System.currentTimeMillis();
        password = faker.regexify("[A-Za-z0-9!@#$%^&*]{8,16}");
    }

    @Test
    public void successfulRegistrationTest() {
        SucessfulRegistrationResponceModel response = apiClient.register(username, password);

        assertThat(response.username()).isEqualTo(username);
        assertThat(response.id()).isGreaterThan(0);
        assertThat(response.firstName()).isEmpty();
        assertThat(response.lastName()).isEmpty();
        assertThat(response.email()).isEmpty();
        assertThat(response.remoteAddr()).matches(IP_REGEX);
    }

    @Test
    public void existingUserWrongRegistrationTest() {
        apiClient.register(username, password);

        ExistingUserResponceModel response = apiClient.registerExistingUser(username, password);

        assertThat(response.username().getFirst()).isEqualTo("A user with that username already exists.");
    }
}