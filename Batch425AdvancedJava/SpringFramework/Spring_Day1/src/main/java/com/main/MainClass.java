package com.main;

public class MainClass {
           public static void main(String args[]) {
        	   ApplicationContext context = new ClassPathXmlApplicationContext("springbeans.xml");
        	   context.getBean(Employee.class);
        	   Employee e =context.getBean("emp" ,Employee.class);
        	   System.out.println(e);
           }
}
