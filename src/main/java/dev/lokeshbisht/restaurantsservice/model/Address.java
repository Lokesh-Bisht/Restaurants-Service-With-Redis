package dev.lokeshbisht.restaurantsservice.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("address")
public class Address {

    @Id
    private String id;

    private String address;

    private String locality;

    private String city;

    private String state;

    private String country;

    private String zipCode;
}
