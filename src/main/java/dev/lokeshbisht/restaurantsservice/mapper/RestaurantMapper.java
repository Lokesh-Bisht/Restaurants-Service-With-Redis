/**
 * Copyright (C) 2023 Lokesh Bisht
 *
 * Licensed under the Apache Software License version 2.0, available at http://www.apache.org/licenses/LICENSE-2.0
 */

package dev.lokeshbisht.restaurantsservice.mapper;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantDto;
import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantUpdateRequestDto;
import dev.lokeshbisht.restaurantsservice.model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {

    Restaurant restaurantDtoToRestaurantMapper(RestaurantDto restaurantDto);

    RestaurantDto restaurantToRestaurantDtoMapper(Restaurant restaurant);

    Restaurant restaurantUpdateRequestDtoToRestaurantMapper(RestaurantUpdateRequestDto restaurantUpdateRequestDto);

}
