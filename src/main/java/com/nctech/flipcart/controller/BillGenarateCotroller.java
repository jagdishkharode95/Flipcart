package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.BillGenarateDTO;
import com.nctech.flipcart.sevices.BillgenerateService;
import com.nctech.flipcart.sevices.servicesimpl.BillgenerateServiceimpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/billgenarate/")
public class BillGenarateCotroller {
    BillgenerateService billgenarateService= new BillgenerateServiceimpl();
    @RequestMapping("save")
    public void save(@RequestBody BillGenarateDTO billGenarate){
        billgenarateService.save(billGenarate);
    }
    @RequestMapping("findbyid")
    BillGenarateDTO findById(@PathVariable int id){
        return billgenarateService.findId( id);
    }
    @RequestMapping("findall")
    List<BillGenarateDTO> findAll(){
        return billgenarateService.findall();
    }
    @RequestMapping("update")
    void update(BillGenarateDTO billGenarate){
        billgenarateService.update(billGenarate);
    }
    @RequestMapping("delete")
    void delete(int id){
        billgenarateService.delete(id);
    }
}
