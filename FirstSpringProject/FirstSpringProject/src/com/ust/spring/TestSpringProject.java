package com.ust.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringProject {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Restaruant restaruantObj = (Restaruant) context.getBean("restaruantBean");
		restaruantObj.greetCustomer();
	}

}
