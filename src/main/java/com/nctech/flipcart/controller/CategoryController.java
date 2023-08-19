package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.CategoryDTO;
import com.nctech.flipcart.sevices.CategoryServices;
import com.nctech.flipcart.sevices.servicesimpl.CategoryServicesImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcat/category/")
public class CategoryController {
    CategoryServices categoryServices= new CategoryServicesImpl();

    @RequestMapping("save")
    void save(@RequestBody CategoryDTO categoryDTO){
        categoryServices.save(categoryDTO);
    }
    @RequestMapping("findbyid")
    CategoryDTO findById(int id){
        return categoryServices.findById(id);
    }
    @RequestMapping("findall")
    List<CategoryDTO> findAll(){
       return categoryServices.findall();
    }
    @RequestMapping("update")
    void update(CategoryDTO categoryDTO){
        categoryServices.update(categoryDTO);
    }
    @RequestMapping("delete")
    void delete(int id){
        categoryServices.delete(id);
    }

}
