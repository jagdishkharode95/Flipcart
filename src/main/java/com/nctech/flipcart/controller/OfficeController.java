package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.OfferDTO;
import com.nctech.flipcart.sevices.OfficeSevices;
import com.nctech.flipcart.sevices.servicesimpl.OfficeSevicesImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcat/office/")
public class OfficeController {
    OfficeSevices officeSevices =new OfficeSevicesImpl();
    @RequestMapping("save")
    void save(@RequestBody OfferDTO offerDTO){
        officeSevices.save(offerDTO);
    }
    @RequestMapping("findbyid")
    OfferDTO findByID (@PathVariable int id){
        return officeSevices.findById(id);
    }
    @RequestMapping("findall")
    List<OfferDTO> findAll(){
        return officeSevices.findAll();
    }
    @RequestMapping("update")
    void update(OfferDTO offerDTO){
         officeSevices.update(offerDTO);
    }
    @RequestMapping("delete")
    void delete(int id){
        officeSevices.delete(id);
    }
}
