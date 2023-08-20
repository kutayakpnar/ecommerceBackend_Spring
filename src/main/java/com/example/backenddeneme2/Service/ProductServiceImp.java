package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.Repository.ProductRepository;
import com.example.backenddeneme2.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImp implements ProductService {
     @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);

    }

    @Override
    public List<Product> getProducts() {

        return productRepository.findAll();
    }

    @Override
    public Product getProductById(Long id) throws Exception {
        Optional<Product> foundProduct= productRepository.findById(id);
        if (foundProduct.isPresent()) {
            return foundProduct.get();
        } else {
            throw new Exception("Product with ID " + id + " not found");
        }
    }
}
