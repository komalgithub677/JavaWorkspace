package com.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.config.ConfigClass1;
import com.tka.Employee1;

public class MainClass3 {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigClass1.class);

        Employee1 e1 = context.getBean(Employee1.class);

        System.out.println(e1);
    }
}