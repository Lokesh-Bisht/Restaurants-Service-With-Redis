package dev.lokeshbisht.restaurantsservice.repository;

import dev.lokeshbisht.restaurantsservice.model.Address;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends MongoRepository<Address, String> {
}
