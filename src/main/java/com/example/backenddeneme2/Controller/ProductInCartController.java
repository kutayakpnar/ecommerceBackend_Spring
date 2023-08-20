package com.example.backenddeneme2.Controller;

import com.example.backenddeneme2.Service.CartService;
import com.example.backenddeneme2.Service.ProductInCartService;
import com.example.backenddeneme2.Service.ProductService;
import com.example.backenddeneme2.entity.Cart;
import com.example.backenddeneme2.entity.Product;
import com.example.backenddeneme2.entity.ProductInCart;
import com.example.backenddeneme2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ecommerce/productInCart")
public class ProductInCartController {

    @Autowired
    ProductInCartService service;
    @Autowired
    CartService cartService;
    @Autowired
    ProductService productService;


    @PostMapping("/{cartId}/{productid}")
    public ProductInCart saveProductInCart (@PathVariable Long cartId, @PathVariable Long productid) throws Exception{


        for(ProductInCart c :service.getAllProductsAndCarts()){
            if(c.getCartId().equals(cartId) && c.getProduct_id().equals(productid)){
                return c;
            }
        }
        ProductInCart productInCart=new ProductInCart();
        productInCart.setCartId(cartId);
        productInCart.setProduct_id(productid);
        return service.SaveCartDetails(productInCart);

    }

    @GetMapping("/{cartId}")
    public List<Product> getProductByCartId(@PathVariable("cartId") Long cartId){
        return service.GetProductsInCart(cartId);
    }



}
