package com.ty.springs.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainPerson {

	public static void main(String[] args) {
		
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("mysprings.xml");
		Person person = (Person)beanFactory.getBean("person");
		person.talk();
	}

}
