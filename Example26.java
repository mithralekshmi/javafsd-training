package com.ust.examples;
//import java.io.*;
 
class Student{
	String name;
	int id;
	Student(String name,int id){
		this.name=name;
		this.id=id;
		
	}
}
public class Example26 {

	public static void main(String[] args) {
		Student s1=new Student("mithra",10);
		System.out.println(s1.name+" "+s1.id);
		

	}

}
