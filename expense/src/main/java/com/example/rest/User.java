package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class User {
	@Autowired
	Employee e;
	String Name;
	String Id;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public User(String name, String id) {
		super();
		Name = name;
		Id = id;
	}
	

}
