package net.emp.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.emp.dto.UserRegistrationDto;
import net.emp.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
