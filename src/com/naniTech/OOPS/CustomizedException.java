package com.naniTech.OOPS;

import java.util.Scanner;

class  Mock extends Exception {
	
	public String toString() {
		
		return "MOCK Exception raised by the User";
	}
}

class Test {
	
	void check (int rate) throws Mock {
		
		if(rate > 5) {
			
			System.out.println("All the best");
		} else {
			
			throw new Mock();
		}
	}
}

public class CustomizedException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mock Rating");
		
		int rate = sc.nextInt();
		
		Test t = new Test();
		try {
			t.check(rate);
		} 
		catch (Mock m) {
			System.out.println(m);
		}

	}

}
