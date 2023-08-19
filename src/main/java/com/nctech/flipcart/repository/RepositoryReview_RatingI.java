package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.Review_RatingDTO;
import org.springframework.data.history.Revision;

import java.util.List;

public interface RepositoryReview_RatingI {
    void save(Review_RatingDTO review_rating);
    List<Review_RatingDTO> get();
}
