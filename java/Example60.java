package com.ust.examples;

public class Example60 {

	static class Inner { 
		public void show() { 
		System.out.println("In a nested class method"); 
		} 
		}

	public static void main(String[] args) {
		//Example48.Inner in = new Example48().new Inner(); 
		Example60.Inner in =new Example60.Inner();
		in.show(); 


	}

}
