package com.ziv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("hello")
	public String hello(){
		System.out.println("hello world!");
		System.out.println("你好啊");
		return "hello";
	}
}
