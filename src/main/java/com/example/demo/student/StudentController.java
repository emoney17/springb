package com.example.demo.student;

import com.example.demo.student.Student;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController
{
    @GetMapping()
    public List<Student> getStudents() {
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
