package com.ust.examples;
public class ExmException4 {

	public static void main(String[] args) {
		try{
			   int arr[] ={1,2,3,4,5};
			   System.out.println(arr[7]);
			}
		        catch(ArrayIndexOutOfBoundsException e){
		        	e.printStackTrace();
			   System.out.println("The specified index does not exist " +
				"in array. Please correct the error.");
			}


	}

}



