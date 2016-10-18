package com.manu.student.studentDAO;

import java.util.List;

import com.manu.student.model.Student;

public interface StudentDAO {
	
	void addNewStudent(Student Student);
	
	void updateStudent(Student Student);
	
	List<Student> getStudentbyId(int StudentId);
	
	List<Student> getAllStudents(int StudentId);

}
