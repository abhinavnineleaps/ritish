package com.example.ecommerce.ecommerce.signup.repository;

import com.example.ecommerce.ecommerce.signup.model.SignupModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SignupDAO {
    @Autowired
    JdbcTemplate jdbcTemplate ;
    public int saveOrUpdate(SignupModel signupModel)
    {
        String saveQuery="INSERT INTO users VALUES (?,?,?,?,?)";
        return jdbcTemplate.update(saveQuery,new Object[]{
                signupModel.getId(),
                signupModel.getLastName(),
                signupModel.getEmailId(),
                signupModel.getPassword(),
                signupModel.getFirstName()


        });

    }
    public List<SignupModel> getallUser()
    {
        String getAllUsrQuery="SELECT * FROM users";
        return jdbcTemplate.query(getAllUsrQuery,new BeanPropertyRowMapper<>(SignupModel.class));

    }




}
