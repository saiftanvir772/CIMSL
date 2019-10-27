package com.exam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@GetMapping(value = "/")
	public ModelAndView getIndexPage() {
		return new ModelAndView("index");
	}
	
	@GetMapping(value = "/aboutJR")
	public ModelAndView getAboutJRPage() {
		return new ModelAndView("pages/aboutJR");
	}
	@GetMapping(value = "/aboutJS")
	public ModelAndView getAboutJSPage() {
		return new ModelAndView("pages/aboutJS");
	}
	@GetMapping(value = "/contactusJR")
	public ModelAndView getContactJRPage() {
		return new ModelAndView("contactusJR");
	}
	@GetMapping(value = "/contactusJS")
	public ModelAndView getContactJSPage() {
		return new ModelAndView("contactusJS");
	}
	
	@GetMapping(value = "/register")
	public ModelAndView getRegistrationPage() {
		return new ModelAndView("pages/register");
	}
	
	
	
}
