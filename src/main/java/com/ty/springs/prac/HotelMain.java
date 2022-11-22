package com.ty.springs.prac;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HotelMain {

	public static void main(String[] args) {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("foodorder.xml");
		
		FoodOrder foodOrder = beanFactory.getBean("food",FoodOrder.class);
		Customer customer = beanFactory.getBean("customer",Customer.class);
		System.out.println("==============Food details are===============");
		System.out.println("Food id is "+foodOrder.getId());
		System.out.println("Food name is "+foodOrder.getName());
		System.out.println("Food totel cost is "+foodOrder.getTotelcost());	
		System.out.println("Food hotel is "+foodOrder.getHotel());
		System.out.println("==============Customer details are===============");
		System.out.println("Customer id is "+customer.getId());
		System.out.println("Customer name is "+customer.getName());
		System.out.println("Customer address is "+customer.getAddress());
		System.out.println("Customer phone is "+customer.getPhone());
		System.out.println("Customer Email is "+customer.getEmail());
		System.out.println("Customer Password is "+customer.getPassword());
	}

}
