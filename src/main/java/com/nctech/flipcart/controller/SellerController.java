package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.SellerDTO;
import com.nctech.flipcart.sevices.SellerServices;
import com.nctech.flipcart.sevices.servicesimpl.SellerServicesImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/seller/")
public class SellerController {
    SellerServices sellerServices= new SellerServicesImpl();
    @RequestMapping("save")
    void save(@RequestBody SellerDTO sellerDTO){
        sellerServices.save(sellerDTO);
    }
    @RequestMapping("findbyid")
    SellerDTO findById(int id){
        return sellerServices.findById(id);
    }
    @RequestMapping("findall")
    List<SellerDTO> findAll(){
        return sellerServices.findAll();
    }
    @RequestMapping("update")
    void update(SellerDTO sellerDTO){
        sellerServices.update(sellerDTO);
    }
    @RequestMapping("delete")
    void delete(int id){
        sellerServices.delete(id);
    }
}
