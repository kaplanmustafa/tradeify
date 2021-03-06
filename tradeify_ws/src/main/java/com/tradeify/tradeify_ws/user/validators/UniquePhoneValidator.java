package com.tradeify.tradeify_ws.user.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.tradeify.tradeify_ws.user.UserRepository;
import com.tradeify.tradeify_ws.user.Users;

public class UniquePhoneValidator implements ConstraintValidator<UniquePhone, String>{

	@Autowired
	UserRepository userRepository;
	
	public boolean isValid(String phone, ConstraintValidatorContext context) {
		
		Users user = userRepository.findByPhone(phone);
		
		if(user != null) {
			return false;
		}
		
		return true;
	}

}
