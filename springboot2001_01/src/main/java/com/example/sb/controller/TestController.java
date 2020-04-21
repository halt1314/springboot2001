package com.example.sb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.sb.model.ConfigBean;



@Controller
public class TestController {
	
	private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	private ConfigBean configBean;
	
	@Value("${com.example.sb.name}")
	private String name;
	@Value("${com.example.sb.age}")
	private String age;
	@Value("${com.example.sb.desc}")
	private String desc;
	@Value("${com.example.sb.random}")
	private String random;
	@Value("${server.port}")
	private int port;
	
	@RequestMapping("/test/sb")
	@ResponseBody
	public String test(){
		
		return "hello world!";
		
	}
	
	@RequestMapping("/test/config")
	@ResponseBody
	public String testConfig(){
		
		StringBuffer sb = new StringBuffer();
		
		System.err.println(sb
							.append(configBean.getName()).append("---")
							.append(configBean.getAge()).append("---")
							.append(configBean.getDesc()).append("---")
							.append(configBean.getRandom()).append("---"));
		System.out.println();
		System.err.println(sb
							.append(port).append("---")
							.append(name).append("---")
							.append(age).append("---")
							.append(desc).append("---")
							.append(random).append("---"));
		
		return "success";
		
		
	}
	
	@RequestMapping("/test/log")
	@ResponseBody
	public String logTest() {
		LOGGER.trace("trace");
		LOGGER.debug("debug");
		LOGGER.info("info");
		LOGGER.warn("warn");
		LOGGER.error("error...123");
		return "success";
	}
}
