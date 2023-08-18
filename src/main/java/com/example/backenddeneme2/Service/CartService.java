package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.entity.Cart;

import java.util.List;

public interface CartService {

    public Cart saveCart(Cart cart);

    public List<Cart> getAllCarts();

}
