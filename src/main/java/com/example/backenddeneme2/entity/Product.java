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







    public String toString(){
        return "id:"+this.id+"\n"+"Product name:"+this.productName+"\n"+"Description:"+this.productDescription
                +"\n"+"Price:"+this.price;
    }

    }

