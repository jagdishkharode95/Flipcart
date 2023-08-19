package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.PaymentDTO;

import java.util.List;

public interface PaymentServices {
    void save(PaymentDTO payment);
    PaymentDTO findById (int id);
    List<PaymentDTO> findAll();
    void update(PaymentDTO payment);
    void delete(int id);
}
