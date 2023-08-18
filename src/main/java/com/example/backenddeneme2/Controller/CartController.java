package com.example.backenddeneme2.Controller;

import com.example.backenddeneme2.Service.CartService;
import com.example.backenddeneme2.Service.ProductService;
import com.example.backenddeneme2.Service.UserService;
import com.example.backenddeneme2.dto.request.SaveCartRequest;
import com.example.backenddeneme2.entity.Cart;
import com.example.backenddeneme2.entity.Product;
import com.example.backenddeneme2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ecommerce/cart")
public class CartController {

    @Autowired
    CartService cartService;
    @Autowired
    UserService userService;
    @Autowired
    ProductService productService;




    @PostMapping("/{userid}/{productid}")
    public Cart saveCart(@PathVariable Long userid,@PathVariable Integer productid) throws Exception {
        Cart cart=new Cart();
        User user=userService.getUserById(userid);
        Product product=productService.getProductById(productid);
        cart.addProductToCart(product);
        cart.setUser(user);
        return cartService.saveCart(cart);

    }

    @GetMapping()
    public List<Cart> getAllCarts(){
        return cartService.getAllCarts();

    }



/*
    @PostMapping("")
    public SaveCartRequest saveCart(@RequestBody SaveCartRequest saveCartRequest) throws Exception {
        return saveCartRequest;

    }*/

}
