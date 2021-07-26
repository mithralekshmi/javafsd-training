package com.ust.examples;
/*
 * 
 * constructor
 */

public class Example22 {
	int x;
	float y;
	String z;

	
	}
Example22 (int x,float y, String z){
	this.x=x;
	this.y=y;
	this.z=z;
}
public static void main(String[]args) {
	Example22 e1=new Example22();
	System.out.println(e1.x);
	Example22 e2=new Example22(2,3.5f,"mithra");
	System.out.println(e2.x);
	Example22 e3=new Example22(2,3.5f,"mithra");
	System.out.println(e3.z);
}

}
