/**
 * Copyright (C) 2023 Lokesh Bisht
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

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
