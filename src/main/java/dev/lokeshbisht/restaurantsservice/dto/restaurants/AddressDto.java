/**
 * Copyright (C) 2023 Lokesh Bisht
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package dev.lokeshbisht.restaurantsservice.dto.restaurants;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Date;

@Data
public class AddressDto {

    @NotNull(message = "RestaurantId is required")
    @JsonProperty("restaurant_id")
    private Integer restaurantId;

    @NotNull(message = "Address is required")
    @JsonProperty("address")
    private String address;

    @JsonProperty("locality")
    private String locality;

    @NotNull(message = "City is required")
    @JsonProperty("city")
    private String city;

    @NotNull(message = "State is required")
    @JsonProperty("state")
    private String state;

    @JsonProperty("country")
    private String country;

    @NotNull(message = "Zip code is required")
    @JsonProperty("zip_code")
    private String zipCode;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("updated_at")
    private Date updatedAt;
}
