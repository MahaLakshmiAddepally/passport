package com.capg.Service;




import java.time.LocalDate;
import java.time.Period;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.Exception.PVSBusinessException;
import com.capg.Model.UserRegistration;
import com.capg.Repo.UserRegistrationRepo;
@Service
//@Component
public class UserRegistrationService {
	@Autowired
	
	UserRegistrationRepo repo;

	public UserRegistration addUserRegistration(UserRegistration User) {

		LocalDate d = LocalDate.now();
		if (!User.getDate_of_birth().isAfter(d)) {

			Period p = Period.between(User.getDate_of_birth(), d);
			System.out.println(p.getYears());
			if (p.getYears() > 0 && p.getYears() < 1) {

				User.setCitizenship("Infant");

			}

			else if (p.getYears() > 1 && p.getYears() < 10) {

				User.setCitizenship("Children");
			}

			else if (p.getYears() > 10 && p.getYears() < 20) {
				User.setCitizenship("Teen");
			}

			else if (p.getYears() > 20 && p.getYears() < 40) {
				User.setCitizenship("Adult");
			}

			else if (p.getYears() > 40) {
				User.setCitizenship("Senior Citizen");
			}

		}

		else

		{
			throw new PVSBusinessException();
		}

		return repo.save(User);

	}

}

		
	


