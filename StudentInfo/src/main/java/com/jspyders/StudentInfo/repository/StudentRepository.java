package com.jspyders.StudentInfo.repository;

import org.springframework.data.repository.CrudRepository;

import com.jspyders.StudentInfo.bean.Student;

public interface StudentRepository extends CrudRepository<Student , String>{
	 

}
