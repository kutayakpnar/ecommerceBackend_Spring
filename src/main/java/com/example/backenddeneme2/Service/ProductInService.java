package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.Repository.CartRepository;
import com.example.backenddeneme2.Repository.ProductInCartRepository;
import com.example.backenddeneme2.Repository.ProductRepository;
import com.example.backenddeneme2.entity.Product;
import com.example.backenddeneme2.entity.ProductInCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductInService implements ProductInCartService{
    @Autowired
    ProductInCartRepository repo;
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;

    @Override
    public ProductInCart SaveCartDetails(ProductInCart productInCart) {

        return repo.save(productInCart);

    }

    @Override
    public List<ProductInCart> getAllProductsAndCarts() {
        return repo.findAll();
    }

    @Override
    public List<Product> GetProductsInCart(Long cartId) {
        List<Product> arr=new ArrayList<>();
        for(Long l:repo.getProductInCartByCartId(cartId)){
            arr.add(productRepository.findById(l).get());
        }
        return arr;

    }
}
