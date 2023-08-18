package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.Repository.CartRepository;
import com.example.backenddeneme2.entity.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImp implements CartService{

    @Autowired
    CartRepository cartRepository;

    @Override
    public Cart saveCart(Cart cart) {

        return cartRepository.save(cart);
    }

    public List<Cart> getAllCarts(){
        return cartRepository.findAll();

    }

}
