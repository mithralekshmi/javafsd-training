package com.ust.examples;
public class ExmException8 {


	public static void main(String[] args) {
		try {
			int a[]=new int[6];
			a[5]=10/0;
		}catch(ArithmeticException e){
			
			System.out.println("ArithmeticException");
			
		}
		catch(ArrayIndexOutOfBoundsException e1){
			
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(Exception e2) {
			
			System.out.println("Exception");
		}
		
		System.out.println("over");

	}

}