package com.ust.examples;

/*
 * 
 * abstract example
 */
//final class test1final{
 class test1final{
	int x=5;
	
	test1final(){
		System.out.println("vehicle class constructor");
	}
	
	/*final void run() {
		System.out.println("running fine");
	}*/
	
	void changeGear() {
		
		System.out.println("this will chnage the gear");
		
	}
}
	class mithra extends test1final {
		
		 void run() {
				System.out.println("running fine");
			}
		
		void changeGear() {
			
			System.out.println("this will chnage the gear.okay!!!");
			//super.changeGear();
		}
		
	}
	

 public class testFinal {

	public static void main(String[] args) {
		mithra V=new mithra();
		System.out.println(V.x);
		
		test1final v1=new test1final();
		v1.changeGear();
		//V.run();
		V.changeGear();
		test1final v2=new mithra();
		v2.changeGear();
	
	

	}

}
