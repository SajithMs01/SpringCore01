package com.springcore.services;

import org.springframework.stereotype.Component;

@Component
public class FedEx implements DeliveryService {

	static {
		System.out.println("Class FedEx  is loaded");
	}
	
	public FedEx()
	{
		System.out.println("FedEx bean is created!");
	}
	public boolean productDelivery(Double amount) {
		System.out.println("Deliver the product with Fedex Services and amount paid is : " + amount);
		return true;
	}

}
