package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.entity.Product;
import com.example.backenddeneme2.entity.ProductInCart;

import java.util.List;

public interface ProductInCartService {

    public ProductInCart SaveCartDetails(ProductInCart proCart);

    public List<ProductInCart> getAllProductsAndCarts();
    public List<Product> GetProductsInCart(Long cartId);

}
