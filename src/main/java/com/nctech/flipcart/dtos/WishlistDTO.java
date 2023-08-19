package com.nctech.flipcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WishlistDTO {
    private int id;
    private List<ProductDto> product;
}
