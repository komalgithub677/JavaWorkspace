package com.tka;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")
@Scope("prototype")
public class Employee1 {
    @Value("123")
    int id;
    
    @Value("Komal")
    String name;

    @Value("Pune")
    String city;

    @Autowired
    Country con;

    public Employee1() {
    }

    @Override
    public String toString() {
        return "Employee1 [id=" + id + ", name=" + name + ", city=" + city + ", con=" + con + "]";
    }
}