 package com.ust.examples;
 interface Animal{
	 public void animalSound();
	 public void sleep();
 }

class Pig impliments Animal{
	public void animalSound(){
		
		System.out.println("the pig says1:wee wee");
}
	public void sleep() {
	
		System.out.println("zzz");
	}
}

class Main{
	public swtatic void main(String[] args) {
		Pig myPig = new Pig();
		myPig.animalSound();
		myPig.sleep();
	}
}


