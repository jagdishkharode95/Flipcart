package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.UserProfileDTO;
import com.nctech.flipcart.sevices.UserProfileServices;
import com.nctech.flipcart.sevices.servicesimpl.UserProfileServicesImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/userprofile/")
public class UserProfileController {
    UserProfileServices userProfileServices=new UserProfileServicesImpl();
    @RequestMapping("save")
    void save (@RequestBody UserProfileDTO userProfileDTO){
        userProfileServices.save(userProfileDTO);
    }
    @RequestMapping("findById")
    UserProfileDTO findById(@PathVariable int id){
        return userProfileServices.findById(id);
    }
    @RequestMapping("findall")
    List<UserProfileDTO> findAll(){
        return  userProfileServices.findAll();
    }
    @RequestMapping("update")
    void update(UserProfileDTO userProfileDTO){
        userProfileServices.update(userProfileDTO);
    }
    @RequestMapping("delete")
    void delete (int id){
        userProfileServices.delete(id);
    }
}
