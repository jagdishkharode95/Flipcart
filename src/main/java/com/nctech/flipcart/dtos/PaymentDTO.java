package com.nctech.flipcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaymentDTO {
    private int id;
    private int price;
    private double cardNumber;
    private int pin;
    private int otp;
    private String upiId;
    private String cashOnDelevary;

}
