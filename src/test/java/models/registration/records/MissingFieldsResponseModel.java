package models.registration.records;

import java.util.List;

    public record MissingFieldsResponseModel(List<String> username, List<String> password) {

}
