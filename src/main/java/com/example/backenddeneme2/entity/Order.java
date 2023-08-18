package com.example.backenddeneme2.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name =" _order")
public class Order  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderid;

    private Long userid;
    private String address;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Order(Long userid,String address){
        this.userid=userid;
        this.address=address;
    }

    public Order(String address){

        this.address=address;
    }















}
