package com.manu.student.service;

import org.springframework.stereotype.Component;

import com.manu.student.model.Student;

@Component
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getStudentDetailsById(String id) {
		Student student = new Student();
		student.setId(123L);
		student.setName("S");
		student.setStd("12A");
		return student;
	}

}
