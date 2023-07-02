package com.jspyders.StudentInfo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspyders.StudentInfo.bean.Student;
import com.jspyders.StudentInfo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;

	public List<Student> getAllStudent() {
		List<Student> students = new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}

	public void addStudent(Student student) {
		studentRepository.save(student);

	}

	public void updateStudent(Student student) {
		studentRepository.save(student);

	}

	public void deleteStudent(String id) {
		studentRepository.deleteById(id);

	}

	

}
