package com.my.cuddlegram.spring.controller.test;

import java.util.Date;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CrunchifySpringAjaxJQuery {

	private static final Logger logger = Logger
			.getLogger(CrunchifySpringAjaxJQuery.class);

	@RequestMapping("/ajax")
	public ModelAndView helloAjaxTest() {
		return new ModelAndView("ajax", "message","Crunchify Spring MVC with Ajax and JQuery Demo..");
	}

	@RequestMapping(value = "/logintest", method = RequestMethod.POST)
	public ModelAndView loginTest() {
		return new ModelAndView("ajax", "message","Crunchify Spring MVC with Ajax and JQuery Demo..");
	}
	
	@RequestMapping(value = "/ajaxtest", method = RequestMethod.GET)
	public @ResponseBody
	String getTime() {
		Random rand = new Random();
		float r = rand.nextFloat() * 100;
		String result = "<br>Next Random # is <b>" + r+ "</b>. Generated on <b>" + new Date().toString() + "</b>";

		// logs debug message
		if (logger.isDebugEnabled()) {
			logger.debug("from CrunchifySpringAjaxJQuery Controller.."+ new Date().toString());
		}

		return result;
	}
}
