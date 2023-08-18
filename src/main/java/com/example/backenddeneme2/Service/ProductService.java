package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public Product addProduct(Product product);

    public List<Product> getProducts();

    public Product getProductById(Integer id) throws Exception;

}
