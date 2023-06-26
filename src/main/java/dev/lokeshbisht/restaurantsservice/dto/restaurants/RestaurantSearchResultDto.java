package dev.lokeshbisht.restaurantsservice.dto.restaurants;

import com.fasterxml.jackson.annotation.JsonProperty;
import dev.lokeshbisht.restaurantsservice.model.Restaurant;
import lombok.Data;

import java.util.List;

@Data
public class RestaurantSearchResultDto {

    @JsonProperty("type")
    private String type;

    @JsonProperty("data")
    private List<Restaurant> restaurantList;
}
