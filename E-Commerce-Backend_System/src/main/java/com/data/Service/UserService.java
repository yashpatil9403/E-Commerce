package com.data.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.DTO.UserLoginDto;
import com.data.DTO.UserRegistrationDto;
import com.data.Entity.User;
import com.data.Repository.UserRepository;

@Service
public class UserService {
	
	 @Autowired
	    UserRepository userRepository;

	    // User registration
	    public String registerUser(UserRegistrationDto registrationDto) {
	        Optional<User> existingUser = userRepository.findByUserEmail(registrationDto.getUserEmail());
	        if (existingUser.isPresent()) {
	            return "Error: User already exists with email " + registrationDto.getUserEmail();
	        }
	        
	        User user = new User();
	        user.setUserName(registrationDto.getUserName());
	        user.setUserEmail(registrationDto.getUserEmail());
	        user.setUserPassword(registrationDto.getUserPassword());
	        user.setMobNumber(registrationDto.getMobNumber());
	        user.setUserAddress(registrationDto.getUserAddress());
	        user.setRole(registrationDto.getRole());

	        userRepository.save(user);
	        return "User registered successfully!";
	    }

	    // User login
	    public String loginUser(UserLoginDto loginDto) {
	        Optional<User> userOpt = userRepository.findByUserEmail(loginDto.getUserEmail());
	        if (userOpt.isPresent()) {
	            User user = userOpt.get();
	            if (user.getUserPassword().equals(loginDto.getUserPassword())) {
	                return "Login successful!";
	            } else {
	                return "Error: Incorrect password!";
	            }
	        } else {
	            return "Error: User not found with email " + loginDto.getUserEmail();
	        }

	    }
}


