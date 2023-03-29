package com.example.ecommerce.ecommerce.signup.controller;

import com.example.ecommerce.ecommerce.signup.exception.IdException;
import com.example.ecommerce.ecommerce.signup.exception.UserException;
import com.example.ecommerce.ecommerce.signup.model.SignupModel;
import com.example.ecommerce.ecommerce.signup.service.SignUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins = "http://localhost:4000")
public class SignupController {
    @Autowired
    private SignUpService signUpService;

    @RequestMapping(value = "/saveauser", method = RequestMethod.GET)
    public int saveUsers(@RequestBody SignupModel payload) {
//        int id=payload.getId();
//        if(payload.getId()==0)
//            throw new IdException("Id not found");
        return signUpService.saveUser(payload);
    }

    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    public List<SignupModel> signupModelList() {
//        if(signUpService.findAllUser()==null) throw new UserException("No content found");
        return signUpService.findAllUser();

    }
//
//    @RequestMapping(value = "/finduserbyid/{id}", method = RequestMethod.GET)
//    public SignupModel findUserById(@PathVariable("id") Integer id) throws UserException  {
//
//        SignupModel signupModel=signUpService.getUserByIdsignUpService(id);
//        if(signupModel==null)
//            throw new UserException(("user not found"));
//
//        return signupModel;
//    }
//
//    @RequestMapping(value = "/updatebyid/{id}", method = RequestMethod.PUT)
//    public SignupModel updateById(@PathVariable("id") Integer id, @RequestBody SignupModel userDetails) throws  UserException{
//        SignupModel signupModel=signUpService.getUserByIdsignUpService(id);
//        if(signupModel==null)
//        {
//            throw  new UserException("can not update user does not exsits");
//        }
//
//        return signUpService.updateUser(id, userDetails);//now we are using the save  function from repository to save the updated information
//    }
//    @RequestMapping(value = "/findagebyid",method = RequestMethod.GET)
//    public List<SignupModel> findByAge()
//    {
//        return signUpService.findByAge();
//    }



}

