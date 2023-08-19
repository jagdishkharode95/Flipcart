package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.PaymentDTO;
import com.nctech.flipcart.dtos.ProductDto;

import java.util.List;

public interface ProductServices {
    void save(ProductDto product);
    ProductDto findById (int id);
    List<ProductDto> findAll();
    void update(ProductDto Payment);
    void delete(int id);
}
