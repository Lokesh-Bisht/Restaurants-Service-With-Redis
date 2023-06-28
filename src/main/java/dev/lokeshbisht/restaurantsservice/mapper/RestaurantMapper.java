package dev.lokeshbisht.restaurantsservice.mapper;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantDto;
import dev.lokeshbisht.restaurantsservice.model.Restaurant;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface RestaurantMapper {

    Restaurant restaurantDtoToRestaurantMapper(RestaurantDto restaurantDto);

    RestaurantDto restaurantToRestaurantDtoMapper(Restaurant restaurant);
}
