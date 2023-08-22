package com.meg.springday1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Color {
	 @Value("${col}")
     private String color;
     @GetMapping("nam")
     public String color(){
     	
			return "My favorite color is "+color;
     }
}