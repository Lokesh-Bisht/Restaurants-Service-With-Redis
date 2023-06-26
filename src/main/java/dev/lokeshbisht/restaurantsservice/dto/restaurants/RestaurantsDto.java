package dev.lokeshbisht.restaurantsservice.dto.restaurants;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class RestaurantsDto {

    @JsonProperty("name")
    private String name;

    @JsonProperty("uuid")
    private UUID uuid;

    @JsonProperty("veg")
    private Boolean veg;

    @JsonProperty("is_new")
    private Boolean isNew;

    @JsonProperty("avg_rating")
    private Float avgRating;

    @JsonProperty("total_ratings")
    private Integer totalRatings;

    @JsonProperty("total_ratings_string")
    private String totalRatingsString;

    @JsonProperty("cuisines")
    private List<String> cuisines;

    @JsonProperty("cost_for_two")
    private Integer costForTwo;

    @JsonProperty("cost_for_two_string")
    private Integer costForTwoString;

    @JsonProperty("delivery_time")
    private Double deliveryTime;

    @JsonProperty("min_delivery_time")
    private Double minDeliveryTime;

    @JsonProperty("max_delivery_time")
    private Double maxDeliveryTime;

    @JsonProperty("delivery_time_string")
    private String deliveryTimeString;

    @JsonProperty("address")
    private AddressDto addressDto;
}
