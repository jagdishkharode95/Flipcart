package com.nctech.flipcart.sevices.servicesimpl;

import com.nctech.flipcart.dtos.UserProfileDTO;
import com.nctech.flipcart.repository.repositoryimpl.RepositoryUserProfileImpl;
import com.nctech.flipcart.sevices.UserProfileServices;

import java.util.List;

public class UserProfileServicesImpl implements UserProfileServices {
    RepositoryUserProfileImpl repositoryUserProfile = new RepositoryUserProfileImpl();
    @Override
    public void save(UserProfileDTO userProfileDTO) {
        repositoryUserProfile.save(userProfileDTO);
    }

    @Override
    public UserProfileDTO findById(int id) {
        for (UserProfileDTO userProfile:repositoryUserProfile.get()
             ) {
            if(userProfile.getId()==id){
                return userProfile;
            }
        }
        return null;
    }

    @Override
    public List<UserProfileDTO> findAll() {
        return repositoryUserProfile.get();
    }

    @Override
    public void update(UserProfileDTO userProfileDTO) {
UserProfileDTO userProfileDTO1 = new UserProfileDTO();
userProfileDTO1.setUserId(userProfileDTO1.getUserId());
userProfileDTO1.setName(userProfileDTO1.getName());
userProfileDTO1.setMobileNumber(userProfileDTO1.getMobileNumber());
userProfileDTO1.setPassword(userProfileDTO1.getPassword());
userProfileDTO1.setDateOfBirth(userProfileDTO1.getDateOfBirth());
    }

    @Override
    public void delete(int id) {
    UserProfileDTO userProfileDTO = findById(id);
    repositoryUserProfile.get().remove(userProfileDTO);
    }
}
