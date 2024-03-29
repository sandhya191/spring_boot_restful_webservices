package com.examples.web;

import java.util.Locale;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/**
 * @author Sandhya
 * Spring Boot Application Starter Class
 * 
 */

@SpringBootApplication
public class RestfulWebServices1Application {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServices1Application.class, args);
	}
	
	@Bean
	public LocaleResolver localeResolver()
	{
		SessionLocaleResolver localeResolver=new SessionLocaleResolver();
		localeResolver.setDefaultLocale(Locale.US);
		
		return localeResolver;
		
	}
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource bundleMessageSource()
	{
		ResourceBundleMessageSource messageSource=new ResourceBundleMessageSource();
		messageSource.setBasename("messages");
		return messageSource;
		
		
	}
}
