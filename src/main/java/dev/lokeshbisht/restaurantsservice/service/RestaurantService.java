package dev.lokeshbisht.restaurantsservice.service;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.AddressDto;
import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantDto;
import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantUpdateRequestDto;

public interface RestaurantService {

    RestaurantDto createRestaurant(RestaurantDto restaurantDto);
    RestaurantDto updateRestaurant(RestaurantUpdateRequestDto restaurantUpdateRequestDto, Integer restaurantId);
    AddressDto updateRestaurantAddress(AddressDto addressDto, Integer restaurantId);
    RestaurantDto getRestaurantById(Integer restaurantId);
}
