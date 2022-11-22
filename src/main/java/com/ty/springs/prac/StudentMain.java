package com.ty.springs.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("studentcong.xml");
		Student student = beanFactory.getBean("std", Student.class);
		System.out.println("Id is "+student.getId());
		System.out.println("Name is "+student.getName());
		System.out.println("Phone is "+student.getPhone());
	}

}
