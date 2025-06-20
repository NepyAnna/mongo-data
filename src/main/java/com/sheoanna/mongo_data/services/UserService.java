package com.sheoanna.mongo_data.services;

import com.sheoanna.mongo_data.models.User;
import com.sheoanna.mongo_data.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User getByName(String name) {
        return userRepository.findByName(name);
    }
}
