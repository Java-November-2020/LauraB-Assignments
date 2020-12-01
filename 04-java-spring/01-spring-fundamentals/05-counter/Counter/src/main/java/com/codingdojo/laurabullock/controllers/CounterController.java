package com.codingdojo.laurabullock.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CounterController {
	
	@RequestMapping("/") //index page
    public String index(HttpSession session){
		
        // check if a key exists in session with the name "count"  --> First time user experience, see platform (Sessions)
	
        if(session.getAttribute("count") == null) { //if no action -- null 
            // Counter must start at zero
            session.setAttribute("count", 0);  //set count to 0
        }
        
        //Increment the counter on each visit to http://your_server/    --> Update session (from a previous value), see platform (Sessions)
		Integer currentCount = (Integer)session.getAttribute("count");
		currentCount++;  //increase currentCount by 1
		session.setAttribute("count", currentCount); //set count to equal currentCount
		return "index.jsp"; //
	}
	
	//Create and display a counter on http://your_server/counter
	@RequestMapping("/counter")  //counter page
	public String count(HttpSession session, Model model) {
		if(session.getAttribute("count") == null) {
			session.setAttribute("count", 0);
			model.addAttribute("currentCount", session.getAttribute("count"));
		}
			Integer currentCount = (Integer)session.getAttribute("count");
			session.setAttribute("count", currentCount);
			model.addAttribute("currentCount", currentCount);
			return "counter.jsp";
	}
	
	//Create a reset button to set the counter back to zero
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		session.setAttribute("count", null);  //when clicked change to null -- no action
		System.out.println("The counter has been reset to zero.");
		return "redirect:/counter"; //return to counter page
	}
}
	

/*Assignment: Counter - http://learn.codingdojo.com/m/145/6906/49938
You need to keep track of how many times the same visitor visits a certain page. To do this, you will first need to write a basic counter. Create two pages, one that will show you how many times someone has visited the other.

Topics:
● Session

Tasks:
● Create and display a counter on http://your_ser+ver/counter

● Increment the counter on each visit to http://your_server/

● Counter must start at zero

● No errors regardless of which page is visited first

Optional Challenges:
● Create a third page that will increment the counter by 2

● Create a reset button to set the counter back to zero*/