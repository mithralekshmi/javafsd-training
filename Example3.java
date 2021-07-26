package com.ust.examples; 
/*This program will help to
*depict the use
*of instance variable
*local variable
*
*
*
*/



public class Example3 {
	String name ;
	double num;
	static int count;
	

	public static void main(String[] args) {
	
		int age = 10;
		System.out.println(age);
		Example3 e =new Example3();
	    e.name="mithra";
	    e.num=5.0;
		count=8;
		System.out.println(e.name);
		System.out.println(e.num);
		System.out.println(count);
		
		
		

				

	}

}
