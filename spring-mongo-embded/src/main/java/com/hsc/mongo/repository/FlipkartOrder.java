package com.hsc.mongo.repository;

import com.hsc.mongo.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlipkartOrder extends MongoRepository<User, Integer> {
    List<User> findByName(String name);

    @Query("{'Address.city':?0}")
    List<User> findByCity(String address);
}
