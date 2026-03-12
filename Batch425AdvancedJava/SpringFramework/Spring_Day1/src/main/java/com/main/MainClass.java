package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.config.configClass;
import com.tka.Employee;

public class MainClass {

	public static void main(String[] args) {
        
//		ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
//		Employee e = context.getBean("emp", Employee.class);
//		System.out.println(e);
		ApplicationContext context = new AnnotationConfigApplicationContext(configClass.class);
		Employee e = context.getBean("emp", Employee.class);
		Employee e1 = context.getBean("emp", Employee.class);
		System.out.println(e.hashCode());//spring follows by default singleton design pattern
		System.out.println(e1.hashCode());
	}
}