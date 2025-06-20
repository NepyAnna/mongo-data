package com.sheoanna.mongo_data.repository;

import com.sheoanna.mongo_data.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
    User findByName(String name);
}
