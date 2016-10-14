/**
 * 
 */
package com.manu.student.main;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.manu.student.model.Student;
import com.manu.student.service.StudentService;

/**
 * @author mohankumara.kb
 * 
 *
 */
@RestController
@ComponentScan("com.manu.*")
public class Controller {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping(value="/{id}", method= RequestMethod.GET, produces="application/json")
	public Student getStudentDetailsById(@PathVariable String id) {
		return studentService.getStudentDetailsById(id);
	}
	
}
