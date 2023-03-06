package com.example.demo.student;

// import com.example.demo.student.Student;
// import com.example.demo.student.StudentService;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/api/v1/student")
public class StudentController
{
    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
	this.studentService = studentService;
    }

    @GetMapping()
    public List<Student> getStudents() {
	return studentService.getStudents();
    }
}
