package tests;

import models.logout.SuccessfulLogoutResponseModel;
import models.login.SuccessfulLoginResponseModel;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static tests.TestData.*;

public class LogoutTests extends TestBase {

    @Test
    public void sucessfullLogoutTest() {
        SuccessfulLoginResponseModel loginResponse = apiClient.login(USERNAME, PASSWORD);

        SuccessfulLogoutResponseModel logoutResponse = apiClient.logout(loginResponse.refresh());

        assertThat(logoutResponse.detail()).isNull();
    }
}