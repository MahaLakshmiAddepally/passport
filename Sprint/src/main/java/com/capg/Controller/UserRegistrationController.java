package com.capg.Controller;



import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.Model.UserRegistration;
import com.capg.Service.UserRegistrationService;



@RestController
@RequestMapping("/UserRegistration")
public class UserRegistrationController {
	
	@Autowired
	 UserRegistrationService Service;
	
	
	
	
		
	
	@PostMapping("/addUserRegistration")
	
	public ResponseEntity< UserRegistration> addUserRegistration(@RequestBody UserRegistration UserRegistration) {
		UserRegistration user=Service.addUserRegistration (UserRegistration);
		
		
		return new ResponseEntity< UserRegistration>(user,HttpStatus.OK);
		
	}
}
		

		
		