package com.javatpoint;

import java.util.List;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Test {
public static void main(String[] args) {
	Session session=new AnnotationConfiguration().configure().buildSessionFactory().openSession();
	
	Transaction t=session.beginTransaction();
	
	Employee e1=new Employee();
	e1.setId(1001);
	e1.setFirstName("sonoo");
	e1.setLastName("jaiswal");
	
	Employee e2=new Employee();
	e2.setId(1002);
	e2.setFirstName("vimal");
	e2.setLastName("jaiswal");
	
	List<Employee> e = session.createQuery("from com.javatpoint.Employee").list();//(e2);
	for (Employee employee : e) {
		System.out.println(employee.getFirstName()+" "+employee.getLastName());
	}
//	session.delete(e2);
	
	t.commit();
	session.close();
	System.out.println("successfully saved");
}
}
