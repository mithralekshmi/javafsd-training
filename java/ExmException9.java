package com.ust.examples;

class StudentNotFoundException extends Exception {
	 
    public StudentNotFoundException(String message) {
        super(message);
    }
}
class Student1{
	
	Student1(){
		
	}
}
 class StudentManager {
	 
	    public Student1 find(String studentID) throws StudentNotFoundException {
	        if (studentID.equals("123456")) {
	            return new Student1();
	        } else {
	            throw new StudentNotFoundException(
	                "Could not find student with ID " + studentID);
	        }
	    }
	}
public class ExmException9 {

	public static void main(String[] args) {
		 StudentManager manager = new StudentManager();
		 
	        try {
	 
	            Student1 student = manager.find("0000001");
	 
	        } catch (StudentNotFoundException ex) {
	            System.err.print(ex);
	        }
		
	}

}