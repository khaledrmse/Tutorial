package com.softsolution;

public class InsuffusantAmmont extends Exception {
	private double credit;
	
	public InsuffusantAmmont (double credit)
	{
		this.credit=credit;
	}

	public double getCredit() {
		return credit;
	}
	
	

}
