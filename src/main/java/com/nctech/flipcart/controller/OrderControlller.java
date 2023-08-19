package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.OrderDTO;
import com.nctech.flipcart.sevices.OrderServices;
import com.nctech.flipcart.sevices.servicesimpl.OrderServicesImpl;
import org.springframework.core.annotation.Order;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/order/")
public class OrderControlller {
    OrderServices orderServices=new OrderServicesImpl();
    @RequestMapping("save")
    void save(@RequestBody OrderDTO order){
        orderServices.save(order);
    }
    @RequestMapping("findbyid")
    OrderDTO findById(@PathVariable int id){
        return orderServices.findById(id);
    }
    @RequestMapping("findall")
    List<OrderDTO> findAll (){
        return orderServices.findAll();
    }
    @RequestMapping("update")
    void update(OrderDTO order){
        orderServices.update(order);
    }
    @RequestMapping("delete")
    void delete (int id){
        orderServices.delete(id);
    }
}
