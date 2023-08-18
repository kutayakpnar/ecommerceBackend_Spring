package com.example.backenddeneme2.Controller;


import com.example.backenddeneme2.Service.UserService;
import com.example.backenddeneme2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ecommerce/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping()
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping ("/{userid}")
    public User getUserById(@PathVariable("userid") Long id){
        return userService.getUserById(id);
    }











}
