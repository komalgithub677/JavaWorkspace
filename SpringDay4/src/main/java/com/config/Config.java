package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tka.Employee;

@Configuration
public class Config {
	@Bean//class level annotation helps to create the beans
	@Scope
public Employee objEmp() {
	return new Employee();
}
}
