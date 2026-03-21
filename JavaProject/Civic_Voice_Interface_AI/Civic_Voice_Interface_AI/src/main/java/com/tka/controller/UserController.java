package com.tka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entities.User;
import com.tka.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/addUser")
	public String insertData(@RequestBody User u) {
	    String msg = service.insertData(u);
	    return msg;
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String deleteData(@PathVariable int id) {
		String msg = service.deleteData(id);
		return msg;
	}
	
	@PutMapping("/updateUser/{id}")
	public String updateData(@RequestBody User u , @PathVariable int  id) {
	    String msg = service.updateData(u ,id);
	    return msg;
	}
	
	@GetMapping("/fetchData")
	public List<User> getAllData() {
	    List<User> list = service.getAllData();
	    return list;
	}
	
	@GetMapping("/singleRecord")
	public User getSingleData(@RequestParam int id) {
	    User u1 = service.getSingleRecord(id);
	    return u1;
	}

}
