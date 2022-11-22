package com.ty.springs.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeacherMain {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("teacher.xml");
		Student1 student1 = beanFactory.getBean("student", Student1.class);
		Teacher teacher= beanFactory.getBean("teacher",Teacher.class);
		System.out.println(student1.getName());
		System.out.println(student1.getAddress());
		System.out.println(teacher.getName());
		System.out.println(teacher.getSchool());
		
//		System.out.println(student1.getTeacher().getName());
//		System.out.println(student1.getTeacher().getSchool());
	}

}
