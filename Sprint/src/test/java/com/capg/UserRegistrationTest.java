package com.capg;



import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.capg.Controller.UserRegistrationController;
import com.capg.Repo.UserRegistrationRepo;

@SpringBootTest
class UserRegistrationTest {
	@MockBean
	private UserRegistrationRepo repo;
	
	@Autowired
	private UserRegistrationController controller;

	@Test
	public void contextLoads() {
		
//		UserRegistration User = new UserRegistration("PASS-1234","Amit","Amit123#a","MCA",
//				"amit@gmail.com","984825398","20-01-1980","Passport","Adult","Male","What is your pet name?","tomy"	)
//                  when(repo.save(p).thenReturn(p));
		assertThat(controller).isNotNull();
	}

	}
