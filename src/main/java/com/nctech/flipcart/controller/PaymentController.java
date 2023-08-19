package com.nctech.flipcart.controller;

import com.nctech.flipcart.dtos.OfferDTO;
import com.nctech.flipcart.dtos.PaymentDTO;
import com.nctech.flipcart.repository.RepositoryPaymentI;
import com.nctech.flipcart.sevices.PaymentServices;
import com.nctech.flipcart.sevices.servicesimpl.PaymentServicesImpl;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flipcart/payment/")
public class PaymentController {
    PaymentServices paymentServices = new PaymentServicesImpl();
    @RequestMapping("save")
    void save(@RequestBody PaymentDTO offer){
        paymentServices.save(offer);
    }
    @RequestMapping("findbyid")
    PaymentDTO findById(@PathVariable int id){
        return paymentServices.findById(id);
    }
    @RequestMapping("findall")
    List<PaymentDTO> findAll(){
        return paymentServices.findAll();
    }
    @RequestMapping("update")
    void update(PaymentDTO payment){
        paymentServices.update(payment);
    }
    @RequestMapping("delete")
    void delete (int id){
        paymentServices.delete(id);
    }
}
