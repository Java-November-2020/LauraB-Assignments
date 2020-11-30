package com.codingdojo.laurabullock.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
//
//	//Have an http GET request to 'http://localhost:8080/dojo' display a text that says 'The dojo is awesome!'.
	@RequestMapping("/dojo")
	public String dojo() {
	//RESPONSE
		String building = "dojo";

	return "The " + building + " is awesome!";
	}
	
	//Have an http GET request to 'http://localhost:8080/dojo/burbank' display a text that says 'Burbank Dojo is located in Southern California'.
	@RequestMapping("/dojo/{place}")
	public String dojoCenter(@PathVariable("place") String place) {
		//RESPONSE
		// capitalize first letter
		return place.substring(0,1).toUpperCase() + place.substring(1) + " Dojo is located in Southern California.";
	}
	
//	//Have an http GET request to 'http://localhost:8080/dojo/san-jose' display a text that says 'SJ dojo is the headquarters'.
//	@RequestMapping("/dojo/{place}")
//	public String dojo(@PathVariable String place) {
//		//RESPONSE
//		// capitalize first letter
//		return place + "--> SJ dojo is the headquarters.";
//	}  //MUST UNCOMMENT THIS SECTION AND COMMENT OUT THE PREVIOUS SECTION (LINES 20-25).  ------>>>>>>> WHAT'S THE PROPER WAY OF ACHIEVING THIS?
}



////Solution:  "switch" and "case" were not covered in the platform or the lectures
//
//@RestController
//public class DojoController {
//	@RequestMapping("/dojo")
//	public String dojo() {
//		return "The dojo is awesome!";
//	}
//	@RequestMapping("/dojo/{location}")
//	public String dojoCenter(@PathVariable("location") String location) {
//		switch(location) {
//		case "burbank":
//			return "Burbank Dojo is located in Southern California";
//		case "san-jose":
//			return "SJ dojo is the headquarters";
//		default:
//			return String.format("%s is pretty sweet!", location);
//		}
//	}
//}






