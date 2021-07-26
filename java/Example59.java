package com.ust.examples;

public class Example59{

	static class Inner { 
		public void show() { 
		System.out.println("In a nested class method"); 
		} 
		}

	public static void main(String[] args) {
		//Example48.Inner in = new Example48().new Inner(); 
		Example59.Inner in =new Example59.Inner();
		in.show(); 


	}

}