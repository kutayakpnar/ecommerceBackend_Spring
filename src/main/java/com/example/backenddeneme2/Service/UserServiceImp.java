package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.Repository.UserRepository;
import com.example.backenddeneme2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService{

    @Autowired
    UserRepository userRepository;
    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
       return userRepository.findAll();
    }

    public User getUserById(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("ID cannot be null.");
        }

        Optional<User> userOptional = userRepository.findById(id);

        if (userOptional.isPresent()) {
            return userOptional.get();
        } else {
            return null;
        }


    }

}
