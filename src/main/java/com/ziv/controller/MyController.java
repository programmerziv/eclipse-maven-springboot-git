package com.ziv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("hello")
	public String hello(){
		System.out.println("hello world!");
		System.out.println("你好啊");
		System.out.println("你倒是说句话啊");
		System.out.println("我就是不更新就提交 看是否会有问题");
		System.out.println("再多几句话怎么样啊~~~");
		return "hello";
	}
}
