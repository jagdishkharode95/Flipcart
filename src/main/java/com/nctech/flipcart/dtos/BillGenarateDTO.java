package com.nctech.flipcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillGenarateDTO {
      private  int id;
      private int srNo;
      private double price;
      private double totlePrice;
      private String userName ;
      private String productName;
      private double discont;
}
