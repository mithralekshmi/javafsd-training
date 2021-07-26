package com.ust.examples;

public class Example61 {
	private int data=30; 
	void display(){  
		System.out.println(data);
		class Local{  
			  
			void msg(){System.out.println(data);
			
			  }  
	  }  
		
	 Local l=new Local();  
	 l.msg();  
	 
	 }  


	public static void main(String[] args) {
		Example61 obj=new Example61();  
		obj.display();  

	}

}