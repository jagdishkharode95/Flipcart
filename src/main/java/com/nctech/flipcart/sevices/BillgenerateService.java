package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.BillGenarateDTO;

import java.util.List;

public interface BillgenerateService {
    void save (BillGenarateDTO billgenaration);
    BillGenarateDTO findId(int id);
    List<BillGenarateDTO> findall();
    void update (BillGenarateDTO billganerate);
    void delete(int id );
}
