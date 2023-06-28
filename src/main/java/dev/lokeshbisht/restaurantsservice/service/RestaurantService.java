package dev.lokeshbisht.restaurantsservice.service;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantDto;
import dev.lokeshbisht.restaurantsservice.model.Restaurant;

public interface RestaurantService {

    RestaurantDto createRestaurant(RestaurantDto restaurantDto);
}
