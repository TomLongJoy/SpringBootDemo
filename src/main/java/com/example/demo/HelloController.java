package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@RequestMapping("/hallo")
	public String hallo() {
		System.out.println("输出信息");
		return "{\"json\":\"hello world... 同application.java 同一个目录可以运行显示在浏览器中\"}";
	}
}
