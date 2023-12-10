/**
 * Copyright (C) 2023 Lokesh Bisht
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package dev.lokeshbisht.restaurantsservice.dto.restaurants;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class RestaurantDto {

    @JsonProperty("name")
    private String name;

    @NotNull(message = "RestaurantId is required")
    @JsonProperty("id")
    private Integer restaurantId;

    @JsonProperty("uuid")
    private UUID uuid;

    @NotNull(message = "veg flag is required")
    @JsonProperty("veg")
    private Boolean veg;

    @JsonProperty("is_new")
    private Boolean isNew;

    @PositiveOrZero(message = "Invalid avg rating. Avg rating can't be negative.")
    @JsonProperty("avg_rating")
    private Float avgRating;

    @PositiveOrZero(message = "Invalid total ratings. Total ratings can't be negative.")
    @JsonProperty("total_ratings")
    private Integer totalRatings;

    @JsonProperty("total_ratings_string")
    private String totalRatingsString;

    @JsonProperty("cuisines")
    private List<String> cuisines;

    @Positive(message = "Cost for two should be greater than zero.")
    @JsonProperty("cost_for_two")
    private Integer costForTwo;

    @JsonProperty("cost_for_two_string")
    private String costForTwoString;

    @Positive(message = "Delivery time should be greater than zero.")
    @JsonProperty("delivery_time")
    private Double deliveryTime;

    @Positive(message = "Minimum delivery time should be greater than zero.")
    @JsonProperty("min_delivery_time")
    private Double minDeliveryTime;

    @Positive(message = "Maximum delivery time should be greater than zero.")
    @JsonProperty("max_delivery_time")
    private Double maxDeliveryTime;

    @JsonProperty("delivery_time_string")
    private String deliveryTimeString;

    @JsonProperty("address")
    private AddressDto addressDto;

    @JsonProperty("created_by")
    private String createdBy;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_by")
    private String updatedBy;

    @JsonProperty("updated_at")
    private Date updatedAt;
}
