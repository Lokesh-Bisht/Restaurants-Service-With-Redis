package dev.lokeshbisht.restaurantsservice.controller;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.AddressDto;
import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantDto;
import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantUpdateRequestDto;
import dev.lokeshbisht.restaurantsservice.service.RestaurantService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/v1")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @PostMapping("/restaurant")
    public RestaurantDto createRestaurant(@Valid @RequestBody RestaurantDto restaurantDto) {
        return restaurantService.createRestaurant(restaurantDto);
    }

    @PatchMapping("/restaurant/{restaurantId}")
    public RestaurantDto updateRestaurant(@Valid @RequestBody RestaurantUpdateRequestDto restaurantUpdateRequestDto, @PathVariable Integer restaurantId) {
        return restaurantService.updateRestaurant(restaurantUpdateRequestDto, restaurantId);
    }

    @PatchMapping("/restaurant/{restaurantId}/address")
    public AddressDto updateRestaurantAddress(@Valid @RequestBody AddressDto addressDto, @PathVariable Integer restaurantId) {
        return restaurantService.updateRestaurantAddress(addressDto, restaurantId);
    }

    @GetMapping("/restaurant/{restaurantId}")
    public RestaurantDto getRestaurantById(@PathVariable Integer restaurantId) {
        return restaurantService.getRestaurantById(restaurantId);
    }
}
