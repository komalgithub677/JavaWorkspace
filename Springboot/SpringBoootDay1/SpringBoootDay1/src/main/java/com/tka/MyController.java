package com.tka;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	         @GetMapping("/firstApi")
             public String firstApi() {
            	 return "This is the first API";
             }
}
