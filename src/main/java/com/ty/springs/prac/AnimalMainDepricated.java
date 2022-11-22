package com.ty.springs.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class AnimalMainDepricated {

	public static void main(String[] args) {
		Resource resource = new ClassPathResource("animal.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Animal animal = beanFactory.getBean("cow",Cow.class);
		animal.eats();
	}

}
