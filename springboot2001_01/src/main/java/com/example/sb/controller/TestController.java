package com.example.sb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
	
	@RequestMapping("/test/sb")
	@ResponseBody
	public String test(){
		
		return "hello world!";
		
	}
}
