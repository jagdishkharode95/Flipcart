package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.ProductDto;
import com.nctech.flipcart.sevices.ProductServices;
import com.nctech.flipcart.sevices.servicesimpl.ProductServicesImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/product/")
public class ProductController {
    ProductServices productServices=new ProductServicesImpl();
    @RequestMapping("save")
    void save (@RequestBody ProductDto product){
        productServices.save(product);
    }
    @RequestMapping("findbyid")
    ProductDto findById(@PathVariable int id){
        return productServices.findById(id);
    }
    @RequestMapping("findall")
    List<ProductDto> findAll () {
        return productServices.findAll();
    }
    @RequestMapping("update")
    void update(ProductDto productDto){
        productServices.update(productDto);
    }
    @RequestMapping("delete")
    void delete(int id){
        productServices.delete(id);
    }
}
