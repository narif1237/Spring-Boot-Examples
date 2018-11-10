package com.example.rest;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class control {

	
	@Value("${arr}")
	private String [] arr;
	
	@Value("#{${users}}")
	private HashMap<String,String> users;
	
	@Autowired
	ApplicationContext appcontext;
	@Autowired
	 PriorityProcessor proc;
	
	
	
	@RequestMapping("/example")
	public void example()
	{
		for(String key:arr)
			System.out.println(key);
		
		for(String key:users.keySet())
			System.out.println(key);
		for(String key:proc.getPriority().keySet())
		{
			System.out.println(key);
		}
		
		
//		ExecutorService executor = Executors.newFixedThreadPool(10);
//		for(int i=0;i<2;i++)
//		{
//		Employee e1=(Employee) appcontext.getBean("emp", "nadim",i);
//	
//		
//		
//		
//		executor.execute(e1);
//		
//		
//		}
//		executor.shutdown();
//        while (!executor.isTerminated()) {
//        }
//        System.out.println("Finished all threads");
		
	}
	//@RequestMapping(value="/example1",headers = { "key1=val1", "key2=val2" })
	@PostMapping("/ex/foos")
	public  ResponseEntity<User> example1( @RequestHeader(value="Accept-Language" ,required=false) String encoding)
	{
		User u=new User("nadim","1");
		System.out.println(encoding);
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Baeldung-Example-Header", 
	      "Value-ResponseEntityBuilderWithHttpHeaders");
	    responseHeaders.set("name","ARIF");
	    
	 
	    ResponseEntity <User>e= ResponseEntity.ok()
	      .headers(responseHeaders)
	      .body(u);
	    return e;
		
	}
	}

