package com.ust.examples;


interface Firstinterface{
	public void myMethod();
}

interface Secondinterface{
	public void myOtherMethod();
}
class DemoClass impliments Firstinterface,Secondinterface{
   public void myMethod() {
	   System.out.println("some text...");
	   }
}

class Main{
	public static void main(String[]args) {
		DemoClass myobj = new DemoClass();
		myobj.myMethod();
		myobj.myOtherMethod();
	}
}
