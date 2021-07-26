package com.ust.examples;

public class ExmException7 {
	
	
    public int getStringSize(String str) throws Exception{
        if(str == null){
            throw new Exception("String input is null");
        }
        return str.length();
    }

	public static void main(String[] args) {
		try {
			ExmException7 met=new ExmException7();
			System.out.println("length of JUNK is "+met.getStringSize("JUNK"));
			System.out.println("length of WRONG is "+met.getStringSize("WRONG"));
            System.out.println("length of null string is "+met.getStringSize(null));
        } catch (Exception ex){
            System.out.println("Exception message: "+ex.getMessage());
        }
    }

	
		

	}

