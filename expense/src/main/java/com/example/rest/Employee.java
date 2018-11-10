package com.example.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component(value="emp")
@Scope("prototype")
public class Employee  implements Runnable{
	
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println(Name +"--------"+age+"-------"+i);
		
		
	}
	String Name;
	
	int age;
	
	
public int getAge() {
		return age;
	}
	public Employee(String name, int age) {
	super();
	Name = name;
	this.age = age;
	System.out.println(name+"---------------------"+age);
}
	public void setAge(int age) {
		this.age = age;
	}
public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
public Employee()
{
	
}
}
