package com.bennett.javapractice.app.ws.exceptions;

public class UserServiceException extends RuntimeException{

	private static final long serialVersionUID = -2663908836768620026L;

	public UserServiceException(String message) {
		super(message);
	}
}
