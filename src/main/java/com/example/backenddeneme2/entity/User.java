package com.example.backenddeneme2.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userid;
    @NonNull
    private String userName;
    private String password;

    public String toString(){
        return this.userid+" "+this.userName+" "+this.password;
    }







}
