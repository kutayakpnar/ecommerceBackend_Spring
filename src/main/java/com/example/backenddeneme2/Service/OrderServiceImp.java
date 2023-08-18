package com.example.backenddeneme2.Service;

import com.example.backenddeneme2.Repository.OrderRepository;
import com.example.backenddeneme2.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImp implements OrderService{

    @Autowired
    OrderRepository orderRepository;

    @Override
    public Order saveOrder(Order order) {
        return  orderRepository.save(order);
    }

    public Order getOrderById(Integer orderid){
        return orderRepository.findById(orderid).get();


    }

    public List<Order> getAllOrders(){
        return orderRepository.findAll();

    }

}
