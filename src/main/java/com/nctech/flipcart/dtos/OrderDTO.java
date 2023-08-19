package com.nctech.flipcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDTO {
    private int id;
    private Double price;
    private String userId;
    private AddressDTO address;
    private long mobileNumber;

}
