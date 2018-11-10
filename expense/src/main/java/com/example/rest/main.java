package com.example.rest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class main {

  @RequestMapping("/sayhello")
  @ResponseBody
  public Employee index() {
    AnnotationConfigApplicationContext cfg=new  AnnotationConfigApplicationContext();
    cfg.scan("com.example.rest");
    cfg.refresh();
    Employee e=(Employee)(cfg.getBean("emp",Employee.class));
    
    System.out.println(e.getName());
    return e;
    
  }

}