package com.example.backenddeneme2.Controller;


import com.example.backenddeneme2.Service.ProductService;

import com.example.backenddeneme2.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ecommerce/product")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping()
    public Product saveProduct(@RequestBody Product product){

        return productService.addProduct(product);
    }

    @GetMapping()
    public List<Product> getProducts(){

        return productService.getProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer id) throws Exception {
        return productService.getProductById(id);
    }







}
