package com.example.backenddeneme2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cartId;

    @OneToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(name="user_id",
            referencedColumnName = "userid")
    private User user;



    public void addProductToCart(Product product){

    }




}
