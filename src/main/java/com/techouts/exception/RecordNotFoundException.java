package com.techouts.exception;

public class RecordNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;

	public RecordNotFoundException(String message) {
		super();
		this.message = message;
	}
	
	

}
