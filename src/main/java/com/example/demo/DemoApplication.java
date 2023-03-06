package com.example.demo;

import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@SpringBootApplication
@RestController
public class DemoApplication {

    public static void main(String[] args) {
	SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping("/")
    public List<Student> hello() {
	return List.of(
	    new Student(
		1L,
		"Maria",
		"marian@jamal.com",
		LocalDate.of(2000, Month.JANUARY, 5),
		21)
	    );
    }
}
