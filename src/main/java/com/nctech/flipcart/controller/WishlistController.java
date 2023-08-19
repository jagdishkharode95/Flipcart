package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.WishlistDTO;
import com.nctech.flipcart.sevices.WishlistServices;
import com.nctech.flipcart.sevices.servicesimpl.WishlistServicesImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/wishlist/")
public class WishlistController {
    WishlistServices wishlistServices=new WishlistServicesImpl();
    @RequestMapping("save")
    void save (@RequestBody WishlistDTO wishlistDTO){
        wishlistServices.save(wishlistDTO);
    }
    @RequestMapping("findbyid")
    WishlistDTO findById(@PathVariable int id){
        return wishlistServices.findById(id);
    }
    @RequestMapping("findall")
    List<WishlistDTO> findAll(){
        return wishlistServices.findAll();
    }
    @RequestMapping("update")
    void update(WishlistDTO wishlistDTO){
        wishlistServices.update(wishlistDTO);
    }
    @RequestMapping ("delete")
    void delete(int id){
        wishlistServices.delete(id);
    }
}
