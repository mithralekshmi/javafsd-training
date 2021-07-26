package com.ust.examples;

public class Example28 {

	int x;
	float y;
	String z;
	Example28(){
	
	}
	Example28(int x,float y){
		//this(String z);
		this.x=x;
		this.y=y;
	}
	Example28(int x,float y,String z ){
		this(x,y);
		//this.x=x;
		//this.y=y;
		this.z=z;
		
	}
	public static void main(String[] args) {
		Example28 e1=new Example28();
		     System.out.println(e1.x);
		     Example28 e2=new Example28(2,3.5f);
		     System.out.println(e2.x);
		Example28 e3=new Example28(2,3.5f,"mithra") ;
		System.out.println(e3.z);

	}

}
