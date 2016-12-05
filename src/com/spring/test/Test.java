package com.spring.test;



import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.entity.User;
import com.spring.serviceimpl.UserServiceImpl;

public class Test {
	public static void main(String[] args) {
		User user=new User();
		user.setUsername("cx");
		user.setPassword("123");
		UserServiceImpl us=(UserServiceImpl)new ClassPathXmlApplicationContext("applicationContext.xml").getBean("userServiceImpl");
		User userget=us.select(user);
		System.out.println(userget.getUsername());
	}
}
