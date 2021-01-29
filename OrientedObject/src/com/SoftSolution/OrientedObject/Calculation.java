package com.SoftSolution.OrientedObject;

public class Calculation {
	protected int w;
	protected int z;
	
	public int addition (int w, int z) {
		return w+z;
	}
	
	
	
	public int getW() {
		return w;
	}
	public void setW(int w) {
		this.w = w;
	}
	public int getZ() {
		return z;
	}
	public void setZ(int z) {
		this.z = z;
	}
	
	public Calculation(int w, int z) {
		super();
		this.w = w;
		this.z = z;
	}
	@Override
	public String toString() {
		return "Calculation [w=" + w + ", z=" + z + "]";
	}
	
	

}
