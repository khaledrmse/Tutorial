package com.SoftSolution.Plymophyirsm;

public class Sallary extends Employee {
	private double sallary;
	
	public void checkSalery()
	{
		System.out.println("Your sallary from Sallary name is-->"+sallary);
	}
	

	public Sallary(String name, String position,double sallary) {
		super(name,position,sallary);
		this.sallary = sallary;
	}

	@Override
	public String toString() {
		return "Sallary [sallary=" + sallary + "]";
	}

	public double getSallary() {
		return sallary;
	}

	public void setSallary(double sallary) {
		this.sallary = sallary;
	}
	

}
