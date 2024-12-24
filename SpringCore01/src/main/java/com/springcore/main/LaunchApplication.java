package com.springcore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApplication {

	public static void main(String[] args) 
	{
		System.out.println("Welcome to our SpringCore Application!");
		
		ApplicationContext container = new ClassPathXmlApplicationContext("applicationcontext.xml");
		
		Amazon amz = container.getBean(Amazon.class);
		
		boolean status = amz.deliverTheProduct(100.00);
		
		if(status)
		{
			System.out.println("product delivered Successfully!");
		}else
		{
			System.out.println("Failed to delivered the product");
		}

		

	}

}
