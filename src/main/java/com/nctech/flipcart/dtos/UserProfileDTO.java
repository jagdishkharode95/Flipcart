package com.nctech.flipcart.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfileDTO {
    private int id;
    private String name;
    private long mobileNumber;
    private String dateOfBirth;
    private AddressDTO address;
    private String userId;
    private String password;
}
