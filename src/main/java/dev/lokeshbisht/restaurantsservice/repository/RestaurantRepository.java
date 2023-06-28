package dev.lokeshbisht.restaurantsservice.repository;

import dev.lokeshbisht.restaurantsservice.model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RestaurantRepository extends MongoRepository<Restaurant, String> {
}
