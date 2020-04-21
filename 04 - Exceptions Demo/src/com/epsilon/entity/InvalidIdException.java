package com.epsilon.entity;

public class InvalidIdException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// source -> generate constructors from superclass -> select necessary constructors
	public InvalidIdException() {
		super();
	}

	public InvalidIdException(String message) {
		super(message);
	}

	public InvalidIdException(Throwable cause) {
		super(cause);
	}

}
