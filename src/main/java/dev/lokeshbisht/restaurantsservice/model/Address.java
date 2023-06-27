package dev.lokeshbisht.restaurantsservice.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

import static dev.lokeshbisht.restaurantsservice.constants.JsonConstants.ISO8601;

@Data
@Document("address")
public class Address {

    @Id
    private String id;

    private Integer restaurantId;

    private String address;

    private String locality;

    private String city;

    private String state;

    private String country;

    private String zipCode;

    private String createdBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ISO8601)
    private Date createdAt;

    private String updatedBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = ISO8601)
    private Date updatedAt;
}
