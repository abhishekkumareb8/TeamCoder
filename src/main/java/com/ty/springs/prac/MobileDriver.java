package com.ty.springs.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileDriver {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("mobile.xml");
		Mobile mobile = beanFactory.getBean("samsung", Samsung.class);
		Mobile mobilei = beanFactory.getBean("iphone", Iphone.class);
		mobile.Os();
		mobilei.Os();
	}

}
