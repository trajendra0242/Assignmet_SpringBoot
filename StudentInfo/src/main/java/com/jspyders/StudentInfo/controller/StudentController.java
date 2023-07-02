package com.jspyders.StudentInfo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.jspyders.StudentInfo.bean.Student;
import com.jspyders.StudentInfo.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService  studentService;
	@RequestMapping("/student")
	public List<Student> getAllStudent(){
		return studentService.getAllStudent();
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/student")
	public void addStudent(@RequestBody Student student) {
		 studentService.addStudent(student);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
	public void updateStudent(@PathVariable String id, @RequestBody Student student) {
		studentService.updateStudent(student);

	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/student/{id}")
	public void deleteSubject(@PathVariable String id) {
		studentService.deleteStudent(id);
	}
}
