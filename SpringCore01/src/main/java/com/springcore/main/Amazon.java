package com.springcore.main;

import org.springframework.stereotype.Component;

import com.springcore.services.DeliveryService;

public class Amazon {
	private DeliveryService service;

	static {
		System.out.println("Class Amazon is loaded");
	}

	public Amazon(DeliveryService service) {

		this.service = service;
	}

	public Amazon() {
		System.out.println("Amazon bean is created!");
	}

	public void setService(DeliveryService service) {
		this.service = service;
	}

	public boolean deliverTheProduct(Double amount) {
		return service.productDelivery(amount);
	}
}
