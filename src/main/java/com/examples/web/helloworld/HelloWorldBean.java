package com.examples.web.helloworld;

/**
 * 
 * @author Sandhya
 * Model used for the HelloWorldController response
 *
 */

public class HelloWorldBean {
	
	private String message;

	public HelloWorldBean(String message) {
		this.message=message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message)
	{
		this.message=message;
	}

	@Override
	public String toString() {
		return String.format("HelloWorldBean [message=%s]" + message);
	}
	

}
