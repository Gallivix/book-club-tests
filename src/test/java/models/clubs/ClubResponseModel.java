package models.clubs;

import java.util.List;

public record ClubResponseModel(
        Integer count,
        String next,
        String previous,
        List<ClubModel> results
) {
}