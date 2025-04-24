package com.example.demo;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.model.Collage;
import com.example.demo.service.CollageService;
import com.example.demo.service.CollageServiceImpl;

@SpringBootApplication
public class CollageCrudApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CollageCrudApplication.class, args);

	}

}
