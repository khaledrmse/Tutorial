package com.softSolution.Generic;

public class Geni <E, T> {

private E name;
private T sallary;
public E getName() {
	return name;
}
public void setName(E name) {
	this.name = name;
}
public T getSallary() {
	return sallary;
}
public void setSallary(T sallary) {
	this.sallary = sallary;
}
public Geni(E name, T sallary) {
	super();
	this.name = name;
	this.sallary = sallary;
}
@Override
public String toString() {
	return "Geni [name=" + name + ", sallary=" + sallary + "]";
}


	
}
