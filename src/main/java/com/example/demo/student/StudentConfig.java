package com.example.demo.student;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@Configuration
public class StudentConfig
 {
     @Bean
     CommandLineRunner commandLinerunner(StudentRepository repository) {
	 return args -> {
	     Student mariam = new Student(
		 "Mariam",
		 "mariam@xyz.com",
		 LocalDate.of(2000, Month.JANUARY, 5));
	     Student alex = new Student(
		 "Alex",
		 "Alex@xyz.com",
		 LocalDate.of(1999, Month.JANUARY, 21));

	     repository.saveAll(
		 List.of(mariam, alex)
		 );
	 };
     };
}
