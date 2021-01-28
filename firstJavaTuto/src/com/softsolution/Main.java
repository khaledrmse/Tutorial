package com.softsolution;

 

public class Main {

	public static void main(String[] args) {
	 
		 GetCredit c = new GetCredit(100, 100);
		try {
			 c.getDemand(1);
			 
			 System.out.println("hello");
			
		}
		catch (InsuffusantAmmont e) {
			 System.out.println("the store needed is"+e.getCredit());
		}
		
		
		finally {
			System.out.println("an exception occured");
		}
		

	}

}
