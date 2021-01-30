package com.softSolution.abstraction;

public class Salarry extends Employe {

	public Salarry(String name, String position) {
		super(name, position);
		System.out.println("new object "+name+" "+ position);
	}

	@Override
	public void displayname() {
		System.out.println("hello abstraction");
		
	}

}
