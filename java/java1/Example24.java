package com.ust.examples;

public class Example24 {
String fName;
String lName;
String city;
String address;
String dob;
float salary;
static int i;
static String b;
Example24(String x,String y,String z,String a,String b,Float c){
	fName=x;
	lName=y;
	city=z;
	address=a;
	dob=b;
	salary=c;
}
void display() {
	System.out.println(fName+" "+lName+" "+city+" "+address+" "+dob+" "+salary);
	
}
	public static void main(String[] args) {
		//Example24 e1=new Example24("mithra","lekshmi","kollam","ghs","21/5/97",28000.0f);
		//Example24 e2=new Example24("meenu","lekshmi","kollam","ghsa","22/11/95",24000.0f);
		//Example24 e3=new Example24("uma","murali","kollam","ghssa",30/5/70",25000.0f);
		//Example24 e4=new Example24("murali","dharan","kollam","ghssa","23/6/69",29000.0f);
		//Example24 e5=new Example2("meera","lekshmi","kollam","ghdz","8/8/93",24500.0f);
		Example24 array[]=new Example24[5];
		array[0]=new Example24("mithra","lekshmi","kollam","ghs","21/5/97",28000.0f);
		array[1]=new Example24("meenu","lekshmi","kollam","ghsa","22/11/95",24000.0f);
		array[2]=new Example24("uma","murali","kollam","ghssa","30/5/70",25000.0f);
		array[3]=new Example24("murali","dharan","kollam","ghssa","23/6/69",29000.0f);
	    array[4]=new Example24("meera","lekshmi","kollam","ghdz","8/893",24500.0f);
	    for (int i=0;i<array.length;i++) {
	    	
	    	array[i].display();
	    }
	    
	    
	    /*for Example24 e.array){
	     //System.out.println(e.fName+e.lName+e.city+e.address+e.dob+e.salary);
	     e.display();
	}*/
	
	
	
	
	
	
	
	/*e1.display();
	 e2.display();
	 e3.display();
	 e4.display();
	 e5.display();*/
	     */
	    
	    }
		


	}


