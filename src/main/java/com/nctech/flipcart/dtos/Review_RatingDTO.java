package com.nctech.flipcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Review_RatingDTO {
    private int id;
    private int productId;
    private String reviewComent;
    private int rating;
}
