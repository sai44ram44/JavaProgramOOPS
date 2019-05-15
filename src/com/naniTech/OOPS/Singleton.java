package com.naniTech.OOPS;

public class Singleton {
	
	//it a type of approach where we can create only one object (instance of the class)
	//Make a constructor of the class as private
	//Create an static method with return type
	
	private static Singleton single_instance = null;
	public String str;
	
	private Singleton() {
		
		str = "Im in Singleton Constructor";
	}
	
	private static Singleton getInstance() {
		
		if(single_instance == null) {
			
			single_instance = new Singleton();
		}
		return single_instance;
	}

	public static void main(String[] args) {
		
		Singleton x = Singleton.getInstance();
		Singleton y = Singleton.getInstance();
		
		x.str = (x.str).toUpperCase();
		System.out.println(x.str);
		
		y.str = (y.str).toLowerCase();
		System.out.println(y.str);
		
		
		 
		

	}

}
