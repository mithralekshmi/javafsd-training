package com.ust.examples;

public class Example62{private int data=30; 
void display(){
	 int value=50;
	class Local{  
		  
		void msg(){System.out.println(value);
		
		  }  
 }  
	
Local l=new Local();  
l.msg();  

}  


public static void main(String[] args) {
	Example62 obj=new Example62();  
	obj.display();  


}

}
