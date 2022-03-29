package com.capg.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capg.Model.UserRegistration;

@Repository
public interface UserRegistrationRepo  extends JpaRepository <UserRegistration, Integer> {
	
	
}
