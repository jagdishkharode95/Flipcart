package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.Review_RatingDB;
import com.nctech.flipcart.dtos.Review_RatingDTO;
import com.nctech.flipcart.repository.RepositoryReview_RatingI;

import java.util.List;

public class RepositoryReview_RatingImpl implements RepositoryReview_RatingI {

    @Override
    public void save(Review_RatingDTO review_rating) {
        Review_RatingDB.revies_ratings.add(review_rating);

    }

    @Override
    public List<Review_RatingDTO> get() {
        return Review_RatingDB.revies_ratings;
    }
}
