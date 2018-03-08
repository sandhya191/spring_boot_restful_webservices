package com.examples.web.helloworld;

import java.util.Locale;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author Sandhya
 * A Demo Spring Boot Rest Controller that displays 
 * an internationalized Good Morning Message in English 
 * and French. Messages are set in message.properties files.
 * 
 */

@RestController
public class HelloWorldController {
	
	@Autowired
	private MessageSource messageSource;
	
	@GetMapping(path="/hello-world")
	public String helloWorld()
	{
		return "Hello world";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean helloWorldBean()
	{
		return new HelloWorldBean("Hello World");
	}
	
	@GetMapping(path="/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name)
	{
		return new HelloWorldBean(String.format("Hello world, %s", name));
	}
	
	@GetMapping(path="/hello-world-internationalized")
	public String helloWorldInternationalized(@RequestHeader(name="Accept-Language", required=false) Locale locale)
	{
		return messageSource.getMessage("good.morning.message", null, locale);
	}

}
