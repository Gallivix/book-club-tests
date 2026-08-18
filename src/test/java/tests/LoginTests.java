package tests;

import models.login.SuccessfulLoginResponseModel;
import models.login.WrongCredentialsLoginResponseModel;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.*;

public class LoginTests extends TestBase {

    @Test
    public void successfulLoginTest() {
        SuccessfulLoginResponseModel response = apiClient.login(USERNAME, PASSWORD);

        assertThat(response.access()).startsWith(JWT_TOKEN_PREFIX);
        assertThat(response.refresh()).startsWith(JWT_TOKEN_PREFIX);
        assertThat(response.access()).isNotEqualTo(response.refresh());
    }

    @Test
    public void wrongCredentialsLoginTest() {
        WrongCredentialsLoginResponseModel response = apiClient.loginWithInvalidCredentials(USERNAME, WRONG_PASSWORD);

        assertThat(response.detail()).isEqualTo(INVALID_CREDENTIALS_ERROR);
    }
}