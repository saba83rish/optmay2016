package com.training.chapter4;

public class TaxCalculatorTest {

	public static void main(String[] args) {

		TaxCalculator calc = new TaxCalculator();
		double returns = calc.getMyReturns(10300, 1600, 700, 200);
		System.out.println("My total tax returns = " + returns);
		
//		TaxCalculator calc1 = new TaxCalculator();
//		double sr = calc1.computeState(1600);
//		System.out.println(sr);

	}

}
