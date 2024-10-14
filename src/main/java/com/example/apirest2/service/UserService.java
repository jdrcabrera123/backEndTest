package com.example.apirest2.service;

import com.example.apirest2.api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    //Store a list of users
    private final List<User> userList;

    public UserService() {
        userList = new ArrayList<>();

        User user1 = new User(23445322, "Juan", "Rodríguez", "Cabrera", "3002568956", "dg 34g 45-5", "Bogotá");
        User user2 = new User(123456278, "Linda", "García", "Bazurto", "3002758956", "dg 79g 45-5", "Bogotá");
        User user3 = new User(87654321, "Ana", "García", "Cabrera", "301258985", "dg 2g 4-8", "Bogotá");
        User user4 = new User(1346798456, "Lorein", "Pérez", "Méndez", "12345679", "Tv 89 45-5", "Bogotá");

        userList.addAll(Arrays.asList(user1, user2, user3, user4));
    }

    // READ operation: Get a user by ID
    public Optional<User> getUser(Integer id) {
        return userList.stream()
                .filter(user -> user.getId() == id)
                .findFirst();
    }


    // GET ALL Users
    public List<User> getAllUsers() {
        return new ArrayList<>(userList);
    }
}