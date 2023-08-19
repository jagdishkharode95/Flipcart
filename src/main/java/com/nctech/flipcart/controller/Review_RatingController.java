package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.Review_RatingDTO;
import com.nctech.flipcart.sevices.Review_RatingServices;
import com.nctech.flipcart.sevices.servicesimpl.Review_RatingServicesImpl;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/review_rating/")
public class Review_RatingController {
    Review_RatingServices review_ratingServices= new Review_RatingServicesImpl();
    @RequestMapping("save")
    void save(@RequestBody Review_RatingDTO review_rating){
        review_ratingServices.save(review_rating);
    }
    @RequestMapping("findbyid")
    Review_RatingDTO findById (int id){
        return review_ratingServices.findById(id);
    }
    @RequestMapping("findall")
    List<Review_RatingDTO> finAll (){
        return review_ratingServices.findAll();
    }
    @RequestMapping("update")
    void update (Review_RatingDTO review_rating){
        review_ratingServices.findAll();
    }
    @RequestMapping("delete")
    void delete (int id){
        review_ratingServices.delete(id);
    }
}
