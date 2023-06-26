package dev.lokeshbisht.restaurantsservice.model;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.AddressDto;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document
public class Restaurants {

    private Boolean veg;

    private String totalRatingsString;

    private List<String> cuisines;

    private Integer costForTwo;

    private Integer costForTwoString;

    private Double deliveryTime;

    private Double minDeliveryTime;

    private Double maxDeliveryTime;

    private String deliveryTimeString;

    private AddressDto addressDto;
}
