package com.ust.examples;

public class Example16 {
	int id;
	String name;
	float Salary;
	void insert(int i,String j, float k) {
		id=i;
		name=j;
		Salary=k;
	}
	void display(){
		System.out.println(id+" "+name+" "+Salary);
	}
	public static void main(String[]args) {
		Example16 e1=new Example16();
		Example16 e2=new Example16();
		Example16 e3=new Example16();
		Example16 e4=new Example16();
		Example16 e5=new Example16();
		
		e1.insert(10,"mithra",20000);
		e2.insert(11,"alona",25000);
		e3.insert(12,"akhila",30000);
		e4.insert(13,"sarmada",35000);
		e5.insert(14,"arya",28000);
		
		e1.display();
		e2.display();
		e3.display();
		e4.display();
		e5.display();
		
		
	
		
	}

}
