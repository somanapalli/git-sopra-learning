package com.sopra;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.sopra.beans.Student;

@SpringBootApplication


public class SpringbootDemoApplication {

	public static void main(String[] args) {
		
		
		ConfigurableApplicationContext context = SpringApplication.run(SpringbootDemoApplication.class, args);
		
		Student stu = context.getBean(Student.class);
		
		stu.setStid(100);
		stu.setFirstName("ram");
		stu.setLastName("sopra");
		
		
		System.out.println(stu);
		
	}

}
