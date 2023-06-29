package dev.lokeshbisht.restaurantsservice.service.impl;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.AddressDto;
import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantDto;
import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantUpdateRequestDto;
import dev.lokeshbisht.restaurantsservice.exceptions.RestaurantNotFoundException;
import dev.lokeshbisht.restaurantsservice.mapper.AddressMapper;
import dev.lokeshbisht.restaurantsservice.mapper.RestaurantMapper;
import dev.lokeshbisht.restaurantsservice.model.Address;
import dev.lokeshbisht.restaurantsservice.model.Restaurant;
import dev.lokeshbisht.restaurantsservice.repository.AddressRepository;
import dev.lokeshbisht.restaurantsservice.repository.RestaurantRepository;
import dev.lokeshbisht.restaurantsservice.service.RestaurantService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

@Service
@Transactional
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restaurantRepository;

    @Autowired
    private AddressRepository addressRepository;

    @Autowired
    private RestaurantMapper restaurantMapper;

    @Autowired
    private AddressMapper addressMapper;

    private static final Logger logger = LoggerFactory.getLogger(RestaurantServiceImpl.class);

    @Override
    public RestaurantDto createRestaurant(RestaurantDto restaurantDto) {
        logger.info("Create restaurant: {}", restaurantDto);
        Restaurant restaurant = restaurantMapper.restaurantDtoToRestaurantMapper(restaurantDto);
        restaurant.setUuid(UUID.randomUUID());
        restaurant.setCreatedAt(Date.from(Instant.now()));
        AddressDto addressDto = restaurantDto.getAddressDto();
        restaurantDto = restaurantMapper.restaurantToRestaurantDtoMapper(restaurantRepository.save(restaurant));
        Address address = addressMapper.addressDtoToAddressMapper(addressDto);
        address.setCreatedAt(Date.from(Instant.now()));
        addressDto = addressMapper.addressToAddressDtoMapper(addressRepository.save(address));
        restaurantDto.setAddressDto(addressDto);
        return restaurantDto;
    }

    @Override
    public RestaurantDto updateRestaurant(RestaurantUpdateRequestDto restaurantUpdateRequestDto, Integer restaurantId) {
        logger.info("Update restaurant info: {} for restaurant: {}", restaurantUpdateRequestDto, restaurantId);
        Restaurant restaurant = restaurantRepository.findByRestaurantId(restaurantId);
        if (restaurant == null) {
            throw new RestaurantNotFoundException("Restaurant not found.");
        }
        Restaurant updatedRestaurantInfo = restaurantMapper.restaurantUpdateRequestDtoToRestaurantMapper(restaurantUpdateRequestDto);
        updatedRestaurantInfo.setId(restaurant.getId());
        updatedRestaurantInfo.setRestaurantId(restaurantId);
        updatedRestaurantInfo.setUuid(restaurant.getUuid());
        updatedRestaurantInfo.setCreatedBy(restaurant.getCreatedBy());
        updatedRestaurantInfo.setCreatedAt(restaurant.getCreatedAt());
        updatedRestaurantInfo.setUpdatedAt(new Date());
        RestaurantDto restaurantDto = restaurantMapper.restaurantToRestaurantDtoMapper(restaurantRepository.save(updatedRestaurantInfo));
        return restaurantDto;
    }
}
