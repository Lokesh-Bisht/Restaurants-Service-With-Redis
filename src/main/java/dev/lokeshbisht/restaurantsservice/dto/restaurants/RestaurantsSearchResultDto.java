package dev.lokeshbisht.restaurantsservice.dto.restaurants;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.lokeshbisht.restaurantsservice.model.Restaurants;
import lombok.Data;

import java.util.List;

@Data
public class RestaurantsSearchResultDto {

    @JsonProperty("type")
    private String type;

    @JsonProperty("data")
    private List<Restaurants> restaurantsList;
}
