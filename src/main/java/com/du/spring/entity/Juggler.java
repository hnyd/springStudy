package com.du.spring.entity;

import com.du.spring.controller.PerformanceController;

public class Juggler implements PerformanceController {

	private int beanBags = 3;
	
	public Juggler() {
	}

	public Juggler(int beanBags) {
		this.beanBags = beanBags;
	}

	@Override
	public void perform() {
		System.out.println("juggling " + beanBags + " beanBags");
	}

}
