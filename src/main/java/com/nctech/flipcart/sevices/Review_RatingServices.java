package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.AddressDTO;
import com.nctech.flipcart.dtos.Review_RatingDTO;

import java.util.List;

public interface Review_RatingServices {
    void save (Review_RatingDTO review_rating);
        Review_RatingDTO findById(int id);
    List<Review_RatingDTO> findAll();
    void update (Review_RatingDTO review_rating);
    void delete (int id);
}
