package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.tka.Person;

public class MainClass2 {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
		Person p = context.getBean("per",Person.class);
		System.out.println(p);

	}

}