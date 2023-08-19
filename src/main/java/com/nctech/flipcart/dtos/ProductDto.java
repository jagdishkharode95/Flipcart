package com.nctech.flipcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
private int id;
private double price;
private String name;
private String category;
private  String specification;
private String reviwe;
}
