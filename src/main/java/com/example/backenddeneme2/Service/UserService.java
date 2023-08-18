package com.example.backenddeneme2.Service;


import com.example.backenddeneme2.entity.User;

import java.util.List;

public interface UserService {

    public User addUser(User user);

    public List<User> getAllUsers();

    public User getUserById(Long id);



}

