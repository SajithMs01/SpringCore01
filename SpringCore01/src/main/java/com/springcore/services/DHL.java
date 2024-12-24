package com.springcore.services;

public class DHL implements DeliveryService {

	static {
		System.out.println("Class DHL is loaded");
	}
	
	public DHL()
	{
		System.out.println("DHL bean is created!");
	}
	public boolean productDelivery(Double amount) {
		System.out.println("Deliver the product with DHL Services and amount paid is : " + amount);
		return true;
	}

}
