package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.AddressDTO;
import com.nctech.flipcart.sevices.AddressService;
import com.nctech.flipcart.sevices.servicesimpl.AddressServicesImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/address/")
public class AddressController {
    AddressService addressServices = new AddressServicesImpl();


    @RequestMapping("save")
    public void save(@RequestBody AddressDTO address) {
        addressServices.save(address);
    }
     @RequestMapping("findByid")
    public AddressDTO findById(@PathVariable int id) {
        return addressServices.findById(id);
    }
    @RequestMapping("findall")
    public List<AddressDTO> findAll() {
        return addressServices.findAll();
    }
    @RequestMapping("update")
    public void update (AddressDTO address){
        addressServices.update(address);
    }
    @RequestMapping("delete")
    public void delete(int id){
        addressServices.delete(id);
    }


}
