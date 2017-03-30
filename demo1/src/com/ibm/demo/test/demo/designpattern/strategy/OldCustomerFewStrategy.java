package com.ibm.demo.test.demo.designpattern.strategy;

public class OldCustomerFewStrategy implements Strategy{

	@Override
	public double getPrice(double standardPrice) {
		System.out.println("打八五折");
		return standardPrice*0.85;
	}

}
