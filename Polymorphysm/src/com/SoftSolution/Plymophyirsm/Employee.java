package com.SoftSolution.Plymophyirsm;

public class Employee {
	
	protected String name;
	protected String position;
	protected double sallary;
	
	
	
	public Employee(String name, String position, double sallary) {
	 
		this.name = name;
		this.position = position;
		this.sallary = sallary;
	}




 




	public void checkSalery()
	{
		System.out.println("Your sallary from Employee name is-->"+sallary);
	}
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public double getSallary() {
		return sallary;
	}
	public void setSallary(double sallary) {
		this.sallary = sallary;
	}
	
	

}
