package dev.lokeshbisht.restaurantsservice.service.impl;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.AddressDto;
import dev.lokeshbisht.restaurantsservice.dto.restaurants.RestaurantDto;
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

import java.util.Date;

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
        restaurant.setCreatedAt(new Date());
        AddressDto addressDto = restaurantDto.getAddressDto();
        restaurantDto = restaurantMapper.restaurantToRestaurantDtoMapper(restaurantRepository.save(restaurant));
        Address address = addressMapper.addressDtoToAddressMapper(addressDto);
        address.setCreatedAt(new Date());
        addressDto = addressMapper.addressToAddressDtoMapper(addressRepository.save(address));
        restaurantDto.setAddressDto(addressDto);
        return restaurantDto;
    }
}
