package com.example.backenddeneme2.Controller;

import com.example.backenddeneme2.Service.OrderService;
import com.example.backenddeneme2.Service.UserService;
import com.example.backenddeneme2.entity.Order;
import com.example.backenddeneme2.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/ecommerce/orders")
public class OrderController {

    @Autowired
    OrderService orderService;
    @Autowired
    UserService userService;

    @PostMapping("/{userid}")
    public Order saveOrder(@RequestBody Order order, @PathVariable("userid") Long userid) {

        User user=userService.getUserById(userid);
        order.setUserid(userid);
        order.setUser(user);
        return orderService.saveOrder(order);
    }

    @GetMapping("/{orderid}")
    public Order getOrderbyId(@PathVariable Integer orderid){
            return orderService.getOrderById(orderid);

    }
    @GetMapping()
    public List<Order> getAllOrders(){
       return orderService.getAllOrders();

    }

}
