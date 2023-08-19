package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.CartDTO;
import com.nctech.flipcart.sevices.CartService;
import com.nctech.flipcart.sevices.servicesimpl.CartServiceImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/cart/")
public class CartController {
    CartService cartService=new CartServiceImpl();

    @RequestMapping("save")
    void save(@RequestBody CartDTO cart){
        cartService.save(cart);
    }
   @RequestMapping("findbyid")
    CartDTO findById(@PathVariable int id){
       return cartService.findById(id);
   }
   @RequestMapping("findall")
    List<CartDTO> findall(CartDTO cart){
        return cartService.findAll();
   }
   @RequestMapping("update")
    void update(CartDTO cart){
        cartService.update(cart);
   }
   @RequestMapping("delete")
    void delete (int id){
        cartService.delete(id);
   }
}
