package com.ty.springs.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnimalDriver {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("animal.xml");
		Animal animal = beanFactory.getBean("cow",Cow.class);
		Animal animal1 = beanFactory.getBean("lion",Lion.class);
		animal.eats();
		animal1.eats();
System.out.println("Animal Lovers");
	}

}
