package com.codingdojo.laurabullock.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringsController {
	//listen for requests on localhost:8080
	
@RequestMapping("")  //empty string is also localhost:8080   <--This is the REQUEST
	public String helloClient() {
		
		//RESPONSE
		return "Hello client! How are you today?";
	}

@RequestMapping("/random")  //This REQUEST goes to the "random" page
	public String random() {
		
		//RESPONSE
		return "There is trouble on the horizon!!  Spring Boot is confusing.  Mine looks different, have spent much time searching for where I should store the files.  Then need to right click on the 'controllers' folder opposed to 'com.codingdojo.laurabullock.controllers' in order to run as Spring Boot App.  I am feeling really sad...  :~(";
	}

}

/*Strings Assignment
In this assignment, you will create a Spring Boot application that will respond with some hard coded text for two routes.

Topics:
- New Spring Boot project
- Annotations
- Dependencies
- Methods

Tasks:
- Create a brand new Spring Boot application
- When a user visits the root route, have a nice message appear for the client.
- When a user visits the '/random' route, have a nice message about Spring Boot appear for the client.*/