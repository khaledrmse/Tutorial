package com.SoftSolution.OrientedObject;

public class Main {

	public static void main(String[] args) {
	Calculation calculation = new MyCalculation(12, 13);
	calculation.addition(12, 12);
	MyCalculation m = new  MyCalculation(12, 15);
	m.addition(5, 5);
	m.multiplication(12, 13);

	}

}
