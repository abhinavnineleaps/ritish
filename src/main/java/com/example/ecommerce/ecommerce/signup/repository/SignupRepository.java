package com.example.ecommerce.ecommerce.signup.repository;

import com.example.ecommerce.ecommerce.signup.model.SignupModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SignupRepository extends JpaRepository<SignupModel,Integer> {
}
