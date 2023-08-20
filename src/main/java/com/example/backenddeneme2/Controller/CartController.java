package com.example.backenddeneme2.Controller;

import com.example.backenddeneme2.Service.CartService;
import com.example.backenddeneme2.Service.ProductInCartService;
import com.example.backenddeneme2.Service.ProductService;
import com.example.backenddeneme2.Service.UserService;
import com.example.backenddeneme2.dto.request.SaveCartRequest;
import com.example.backenddeneme2.entity.Cart;
import com.example.backenddeneme2.entity.Product;
import com.example.backenddeneme2.entity.ProductInCart;
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
    @Autowired
    ProductInCartService productInCartService;




    @PostMapping("/{userid}/{productid}")
    public Cart saveCart(@PathVariable Long userid,@PathVariable Long productid) throws Exception {
        //User user=userService.getUserById(userid)
        User user = userService.getUserById(userid);

        for(Cart c :cartService.getAllCarts()){
            if(c.getUser().getUserid().equals(userid)){

                for(ProductInCart p :productInCartService.getAllProductsAndCarts()){
                    if(p.getCartId().equals(c.getCartId()) && p.getProduct_id().equals(productid)){
                        return c;
                    }
                }
                ProductInCart productInCart=new ProductInCart();
                productInCart.setCartId(c.getCartId());
                productInCart.setProduct_id(productid);
                productInCartService.SaveCartDetails(productInCart);

                return c;
            }
        }

        Cart cart = new Cart();
        cart.setUser(user);
        cartService.saveCart(cart);

        for(ProductInCart p :productInCartService.getAllProductsAndCarts()){
            if(p.getCartId().equals(cart.getCartId()) && p.getProduct_id().equals(productid)){
                return cart;
            }
        }
        ProductInCart productInCart=new ProductInCart();
        productInCart.setCartId(cart.getCartId());
        productInCart.setProduct_id(productid);
        productInCartService.SaveCartDetails(productInCart);

        return cart;

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
