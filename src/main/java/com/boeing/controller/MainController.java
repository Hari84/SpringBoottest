package com.boeing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

	
	@RequestMapping("/test")
	   @ResponseBody
	   String home1() {
	      return "Hello World!";
	  }
	
	
	@RequestMapping("/home")
	 public String home() {
	  return "index";
	 }
}




