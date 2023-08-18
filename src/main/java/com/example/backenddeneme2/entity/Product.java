package com.example.backenddeneme2.entity;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    @Id
    private Long id;
    private String productName;
    private String productDescription;
    private Float price;

    @ManyToOne(
            cascade = CascadeType.ALL
    )
    @JoinColumn(
            name="cart_id",
            referencedColumnName = "cartId"
    )
    private Cart cart;

    public Product(Long id,String productName,String productDescription,Float price){
        this.id=id;
        this.productName=productName;
        this.productDescription=productDescription;
        this.price=price;

    }



    public String toString(){
        return "id:"+this.id+"\n"+"Product name:"+this.productName+"\n"+"Description:"+this.productDescription
                +"\n"+"Price:"+this.price;
    }

    }

