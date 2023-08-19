package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.Review_RatingDTO;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryReview_RatingImpl;
import com.nctech.flipcart.sevices.Review_RatingServices;

import java.util.List;

public class Review_RatingServicesImpl implements Review_RatingServices {
    RepositoryReview_RatingImpl repositoryReview_rating = new RepositoryReview_RatingImpl();
    @Override
    public void save(Review_RatingDTO review_rating) {
        repositoryReview_rating.save(review_rating);
    }

    @Override
    public Review_RatingDTO findById(int id) {
        for (Review_RatingDTO review_Rating: repositoryReview_rating.get()
             ) {
            if(review_Rating.getId()==id){
                return review_Rating;
            }
        }
        return null;
    }

    @Override
    public List<Review_RatingDTO> findAll() {
        return repositoryReview_rating.get();
    }

    @Override
    public void update(Review_RatingDTO review_rating) {
        Review_RatingDTO review_ratingDTO = new Review_RatingDTO();
        review_ratingDTO.setRating(review_ratingDTO.getRating());
        review_ratingDTO.setReviewComent(review_ratingDTO.getReviewComent());
        review_ratingDTO.setProductId(review_ratingDTO.getProductId());
    }

    @Override
    public void delete(int id) {
        Review_RatingDTO review_ratingDTO=findById(id);
        repositoryReview_rating.get().remove(review_ratingDTO);
    }
}
