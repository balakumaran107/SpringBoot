package com.spring.boot.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class SpringBootExample {

  public static void main(String args[]) {
    SpringApplication.run(SpringBootExample.class, args);
  }

  @RequestMapping("/")
  String sayHello() {
    return "hey there how are you doing !!!";
  }
}