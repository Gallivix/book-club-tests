package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import models.clubs.ClubModel;
import models.clubs.ClubResponseModel;
import models.clubs.ReviewModel;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.regex.Pattern;

import static org.assertj.core.api.Assertions.assertThat;

@Epic("API тесты")
public class ClubsTests extends TestBase {

    @Test
    @Description("Успешное получение списка клубов - статус 200")
    void testGetClubsReturns200() {
        ClubResponseModel response = apiClient.getClubs();

        assertThat(response.count()).isNotNull();
        assertThat(response.results()).isNotNull();
    }

    @Test
    @Description("Проверка структуры пагинации в ответе")
    void testClubsResponseHasValidPagination() {
        ClubResponseModel response = apiClient.getClubs();

        // count должен быть >= 0
        assertThat(response.count()).isGreaterThanOrEqualTo(0);

        // next и previous могут быть null или строкой
        if (response.next() != null) {
            assertThat(response.next()).contains("page=");
        }
        if (response.previous() != null) {
            assertThat(response.previous()).contains("page=");
        }
    }

    @Test
    @Description("Проверка что results не пустой")
    void testClubsResultsNotEmpty() {
        ClubResponseModel response = apiClient.getClubs();

        assertThat(response.results()).isNotEmpty();
        assertThat(response.results().size()).isGreaterThan(0);
    }

    @Test
    @Description("Проверка обязательных полей клуба")
    void testClubHasRequiredFields() {
        ClubResponseModel response = apiClient.getClubs();
        ClubModel firstClub = response.results().getFirst();

        assertThat(firstClub.id()).isNotNull();
        assertThat(firstClub.bookTitle()).isNotNull();
        assertThat(firstClub.bookAuthors()).isNotNull();
        assertThat(firstClub.publicationYear()).isNotNull();
        assertThat(firstClub.description()).isNotNull();
        assertThat(firstClub.telegramChatLink()).isNotNull();
        assertThat(firstClub.owner()).isNotNull();
        assertThat(firstClub.members()).isNotNull();
        assertThat(firstClub.reviews()).isNotNull();
        assertThat(firstClub.created()).isNotNull();
    }

    @Test
    @Description("Проверка типов данных полей клуба")
    void testClubFieldsTypes() {
        ClubResponseModel response = apiClient.getClubs();
        ClubModel firstClub = response.results().getFirst();

        // Integer поля
        assertThat(firstClub.id()).isInstanceOf(Integer.class);
        assertThat(firstClub.publicationYear()).isInstanceOf(Integer.class);
        assertThat(firstClub.owner()).isInstanceOf(Integer.class);

        // String поля
        assertThat(firstClub.bookTitle()).isInstanceOf(String.class);
        assertThat(firstClub.bookAuthors()).isInstanceOf(String.class);
        assertThat(firstClub.description()).isInstanceOf(String.class);
        assertThat(firstClub.telegramChatLink()).isInstanceOf(String.class);
        assertThat(firstClub.created()).isInstanceOf(String.class);

        // List поля
        assertThat(firstClub.members()).isInstanceOf(List.class);
        assertThat(firstClub.reviews()).isInstanceOf(List.class);
    }

    @Test
    @Description("Проверка структуры клуба с отзывами")
    void testClubWithReviewsHasValidStructure() {
        ClubResponseModel response = apiClient.getClubs();

        // Ищем клуб с отзывами
        ClubModel clubWithReviews = response.results().stream()
                .filter(club -> !club.reviews().isEmpty())
                .findFirst()
                .orElseThrow();

        ReviewModel review = clubWithReviews.reviews().getFirst();

        assertThat(review.id()).isNotNull();
        assertThat(review.club()).isNotNull();
        assertThat(review.user()).isNotNull();
        assertThat(review.user().id()).isNotNull();
        assertThat(review.user().username()).isNotNull();
        assertThat(review.review()).isNotNull();
        assertThat(review.assessment()).isNotNull();
        assertThat(review.readPages()).isNotNull();
        assertThat(review.created()).isNotNull();
    }

    @Test
    @Description("Проверка формата даты created (ISO datetime)")
    void testCreatedDateFormat() {
        ClubResponseModel response = apiClient.getClubs();

        Pattern isoDateTimePattern = Pattern.compile(
                "^\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}(\\.\\d+)?Z?$"
        );

        response.results().forEach(club ->
                assertThat(club.created())
                        .matches(isoDateTimePattern)
        );
    }

    @Test
    @Description("Проверка работы пагинации - переход на следующую страницу")
    void testPaginationNextPage() {
        ClubResponseModel firstPage = apiClient.getClubs(1);

        if (firstPage.next() != null) {
            ClubResponseModel secondPage = apiClient.getClubs(2);

            assertThat(secondPage).isNotNull();
            assertThat(secondPage.results()).isNotEmpty();

            // Проверяем что clubs на разных страницах разные
            assertThat(secondPage.results().getFirst().id())
                    .isNotEqualTo(firstPage.results().getFirst().id());
        }
    }

    @Test
    @Description("Проверка что owner является членом клуба")
    void testOwnerIsMember() {
        ClubResponseModel response = apiClient.getClubs();

        response.results().forEach(club ->
                assertThat(club.members())
                        .contains(club.owner())
        );
    }

    @Test
    @Description("Проверка count соответствует размеру results")
    void testCountMatchesResultsSize() {
        ClubResponseModel response = apiClient.getClubs();

        // На последней странице count может быть больше чем size results
        // На первой странице если нет пагинации - count == results.size()
        if (response.next() == null && response.previous() == null) {
            assertThat(response.count()).isEqualTo(response.results().size());
        }
    }
}