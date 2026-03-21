package com.tka;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/w3Schools")
public class MyController {
	         @RequestMapping(value="/java" , method=RequestMethod.GET)
             public String firstApi() {
            	 return "This is the first API";
             }
	         
	         @DeleteMapping("/python")
             public String python() {
            	 return "Python is an open source programmign language";
             }
	         @GetMapping("/secondApi")
             public String secondApi() {
            	 return "This is the first API";
             }
	         @PostMapping("/java")
             public String java() {
            	 return "Java is an programming language";
             }
	         @PutMapping("/html")
             public String html() {
            	 return "Html is an hypertext markup language";
             }
	         
}
