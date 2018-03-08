package com.examples.web.user;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 
 * @author Sandhya
 * Exception that will be thrown when a requested user is not found
 *
 */

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	

	

}
