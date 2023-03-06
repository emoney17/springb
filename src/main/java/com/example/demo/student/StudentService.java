package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService
{
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
