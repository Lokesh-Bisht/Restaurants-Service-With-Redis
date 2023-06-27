package dev.lokeshbisht.restaurantsservice.mapper;

import dev.lokeshbisht.restaurantsservice.dto.restaurants.AddressDto;
import dev.lokeshbisht.restaurantsservice.model.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressMapper {

    Address addressDtoToAddressMapper(AddressDto addressDto);

    AddressDto addressToAddressDtoMapper(Address address);
}
