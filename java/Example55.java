package com.ust.examples;
/*
 *Example of inner class 
 * 
 * 
 */

public class Example55 {
	private int x;

		void display() {
			System.out.println("example of outer class");
			
		}
		private class Inner{
			void display() {
				System.out.println("example of inner class");
				
			}
	}
private static void main(String[]args) {
	Example55. Inner e1=new Example55().new Inner();
	Example55 e2=new Example55();
	e2.x=5;
	e2.x   display();
	System.out.prtintln(e2.x);

	e1.display();
	
}
}
