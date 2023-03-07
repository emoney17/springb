package com.example.demo.student;

import com.example.demo.student.StudentRepository;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.time.LocalDate;
import java.time.Month;

@Service
public class StudentService
{
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
	this.studentRepository = studentRepository;
    }
    public List<Student> getStudents() {
	return studentRepository.findAll();
    }

}
