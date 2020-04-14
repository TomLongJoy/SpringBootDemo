package com.exampple.demo.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@RequestMapping(value = "/springboot")
public class FirstController {
	@RequestMapping(value = "/helloworld",method = RequestMethod.GET)
	String helloworld(@RequestParam(value = "userName") String userName){
		
		/**
		 * 404 -- 是什么
		 * https://www.iteye.com/blog/412887952-qq-com-2347057 -- 为什么
		 * https://blog.csdn.net/qq_27905183/article/details/79080610 -- 怎么办
		 * */
		System.out.println("@ComponentScan(basePackages = {\"com.example.demo\",\"com.exampple.demo.controller\"})");
        return "Hello " + userName;
    }
//	
//	
//	public String HelloWorld() {
//		return "{'json':'Hello World'}";//这个不能显示在浏览器中
//	}
}
