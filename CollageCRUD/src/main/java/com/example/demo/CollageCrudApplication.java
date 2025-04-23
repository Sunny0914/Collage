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

		CollageService cs = context.getBean(CollageServiceImpl.class);

		int id;
		String name;
		float fees;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("""
					1. Insert
					2. Display
					3. Update
					4. Delete
					5. Exit
					Enter A Choice
					""");

			int ch = sc.nextInt();

			switch (ch) {
			case 1 -> {
				System.out.println("Enter A Collage Details :");
				System.out.println("Enter A Name :");
				name = sc.next();
				System.out.println("Enter A Fees :");
				fees = sc.nextFloat();
				
				cs.add(new Collage(name, fees));

			}
			case 2 -> {
				cs.display().forEach(System.out::println);
			}
			case 3 -> {

			}
			case 4 -> {
				System.out.println("Enter A ID : ");
				id = sc.nextInt();
				cs.delete(id);

			}
			case 5 -> {
				System.exit(0);
			}

			default -> {
				System.out.println("INVALID CHOICE !!");
			}
			}

		}
	}

}
