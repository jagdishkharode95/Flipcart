package com.nctech.flipcart.sevices;

import com.nctech.flipcart.dtos.UserProfileDTO;

import java.util.List;

public interface UserProfileServices {
    void save (UserProfileDTO userProfileDTO);
    UserProfileDTO findById (int id);
    List<UserProfileDTO> findAll();
    void update(UserProfileDTO userProfileDTO);
    void delete (int id);
}
