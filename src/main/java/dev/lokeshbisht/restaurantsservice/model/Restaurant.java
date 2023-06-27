package dev.lokeshbisht.restaurantsservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import static dev.lokeshbisht.restaurantsservice.constants.JsonConstants.ISO8601;

@Data
@Document
public class Restaurant {

    @Id
    private String id;

    private String name;

    private Integer restaurantId;

    private UUID uuid;

    private Boolean veg;

    private Boolean isNew;

    private Float avgRating;

    private Integer totalRatings;

    private String totalRatingsString;

    private List<String> cuisines;

    private Integer costForTwo;

    private String costForTwoString;

    private Double deliveryTime;

    private Double minDeliveryTime;

    private Double maxDeliveryTime;

    private String deliveryTimeString;

    private String createdBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ISO8601)
    private Date createdAt;

    private String updatedBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ISO8601)
    private Date updatedAt;
}
