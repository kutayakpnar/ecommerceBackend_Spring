package com.example.backenddeneme2.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductInCart {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    Long product_id;
    Long cartId;



}
