package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.HelpDTO;
import com.nctech.flipcart.sevices.HelpServices;
import com.nctech.flipcart.sevices.servicesimpl.HelpServicesImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/help/")
public class HelpController {
    HelpServices helpServices=new HelpServicesImpl();

    @RequestMapping("save")
    void save(@RequestBody HelpDTO help){
        helpServices.save(help);
    }
    @RequestMapping("findById")
    HelpDTO findById(@PathVariable int id){
        return helpServices.findById(id);
    }
    @RequestMapping("findall")
    List<HelpDTO> findAll (){
        return helpServices.findAll();
    }
    @RequestMapping("update")
    void update (HelpDTO help){
        helpServices.update(help);
    }
    @RequestMapping("delete")
    void delete(int id){
        helpServices.delete(id);
    }
}
