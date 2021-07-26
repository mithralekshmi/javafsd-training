package com.ust.examples;

public class Example25 {
String web;
Example25(String w){
	web=w;
}
Example25(Example25 cc){
	web=cc.web;
}
void display() {
	System.out.println("Constructor::"+web);
	}
	public static void main(String[]args) {
		
		
	
		Example25 e1=new Example25("mithra");
		Example25 e2=new Example25(e1);
		e1.display();
		e2.display();
		
	
}
}
