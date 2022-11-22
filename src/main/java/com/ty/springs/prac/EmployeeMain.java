package com.ty.springs.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("employee.xml");
		Employee employee = beanFactory.getBean("emp",Employee.class);
		System.out.println("Id is "+employee.getId());
		System.out.println("Name is "+employee.getName());
		System.out.println("Address is "+employee.getAddress());
		System.out.println("Phone no is 3"+employee.getPhone());
	}

}
