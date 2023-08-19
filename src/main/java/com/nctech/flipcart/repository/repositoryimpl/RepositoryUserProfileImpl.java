package com.nctech.flipcart.repository.repositoryimpl;

import com.nctech.flipcart.database.UserProfileDB;
import com.nctech.flipcart.dtos.UserProfileDTO;
import com.nctech.flipcart.repository.RepositoryUserProfileI;

import java.util.List;

public class RepositoryUserProfileImpl implements RepositoryUserProfileI {
    @Override
    public void save(UserProfileDTO userProfile) {
        UserProfileDB.userProfiles.add(userProfile);
    }

    @Override
    public List<UserProfileDTO> get() {
        return UserProfileDB.userProfiles;
    }
}
