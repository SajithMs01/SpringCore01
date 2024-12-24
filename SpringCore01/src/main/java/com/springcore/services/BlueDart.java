package com.springcore.services;

public class BlueDart implements DeliveryService {

	static {
		System.out.println("Class BlueDart is loaded");
	}
	
	public BlueDart()
	{
		System.out.println("BlueDart bean is created!");
	}
	public boolean productDelivery(Double amount) {
		System.out.println("Deliver the product with BlueDarts Services and amount paid is : " + amount);
		return true;
	}

}
