package dev.lokeshbisht.restaurantsservice.controller;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantDto;
import dev.lokeshbisht.restaurantsservice.model.Restaurant;
import dev.lokeshbisht.restaurantsservice.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/v1")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/restaurant")
    public RestaurantDto createRestaurant(@RequestBody RestaurantDto restaurantDto) {
        return restaurantService.createRestaurant(restaurantDto);
    }
}
