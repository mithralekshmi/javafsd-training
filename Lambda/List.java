package com.ust.lambda;

import java.util.ArrayList;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> pointList = new ArrayList();
		 
		pointList.add("1");
		pointList.add("2");
		 
		pointList.forEach(p ->  { System.out.println(p); } );



	}

}
