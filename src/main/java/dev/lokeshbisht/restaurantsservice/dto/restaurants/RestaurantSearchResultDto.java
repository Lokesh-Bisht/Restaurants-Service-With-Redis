/**
 * Copyright (C) 2023 Lokesh Bisht
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

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
