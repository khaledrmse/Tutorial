package com.softSolution.abstraction;

public abstract class Employe {
	
	protected String name;
	protected String position;
	
	public abstract void displayname() ;
	
	public Employe(String name, String position) {
		super();
		this.name = name;
		this.position = position;
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
	
	
}
