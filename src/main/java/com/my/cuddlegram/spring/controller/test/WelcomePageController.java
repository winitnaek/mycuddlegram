package com.my.cuddlegram.spring.controller.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomePageController {

	@RequestMapping(value = { "/test"}, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
 		String message = "<br><div align='center'>"+ "<h3>********** Hello World, Spring MVC Tutorial</h3>This message is comming from WelcomePageController.java **********<br><br>";
		return new ModelAndView("index", "message", message);
 	}
}
