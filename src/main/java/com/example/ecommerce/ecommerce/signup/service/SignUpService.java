package com.example.ecommerce.ecommerce.signup.service;

import com.example.ecommerce.ecommerce.signup.model.SignupModel;
import com.example.ecommerce.ecommerce.signup.repository.SignupDAO;
import com.example.ecommerce.ecommerce.signup.repository.SignupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SignUpService {

   @Autowired
    SignupDAO signupDAO;

//    public SignupModel getUserByIdsignUpService(Integer id) {
//        Optional<SignupModel> checkUser = signupRepository.findById(id);
//        if (checkUser.isPresent())
//            return checkUser.get();
//        return null;
//    }

    public int saveUser(SignupModel user) {

        return signupDAO.saveOrUpdate(user);
    }

    public List<SignupModel> findAllUser() {
        return signupDAO.getallUser();
    }
//
//    public SignupModel updateUser(Integer id, SignupModel userDetails) {
//        if (!signupRepository.existsById(id)) {
//            return null;
//        }
//        Optional<SignupModel> user = signupRepository.findById(id); //Optional for null pointer exception.
//        SignupModel new_user = user.get();// To access the details for users
//        new_user.setFirstName(userDetails.getFirstName());// To change the firstname
//        new_user.setLastName(userDetails.getLastName());//to change the last name
//        return signupRepository.save(new_user);//now we are using the save  function from repository to save the updated information
//    }
//    public List<SignupModel> findByAge()
//    {
//        return signupRepository.findByAge();
//
//    }


}


