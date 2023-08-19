package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.ProductDto;

import java.util.List;

public interface RepositoryProductI {
    void save(ProductDto product);
    List<ProductDto> get();
}
