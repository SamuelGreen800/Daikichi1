package com.SamGreen.Daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}

	 @GetMapping("/")
	    public ModelAndView redirectWithUsingRedirectPrefix(ModelMap model) {
	        
	        return new ModelAndView("redirect:/daikichi", model);
	    }
	
	

		@RequestMapping("/daikichi")
		public String hello() {
			return "Welcome to Daikichi Routes!";
		}
		@RequestMapping("/daikichi/today")
		public String today() {
			return "Today, you will find luck in all your endevors!";
		}
		
		@RequestMapping("/daikichi/tomorrow") 
			public String tomorrow() {
			return "Tomorrow, and opportunity will arise, so be sure to be open to new ideas";
		}
}
