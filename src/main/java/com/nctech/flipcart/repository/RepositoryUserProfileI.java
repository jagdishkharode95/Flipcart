package com.nctech.flipcart.repository;

import com.nctech.flipcart.dtos.UserProfileDTO;

import java.util.List;

public interface RepositoryUserProfileI {
    void save (UserProfileDTO userProfile);
    List<UserProfileDTO> get();
}
