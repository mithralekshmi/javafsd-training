package com.ust.examples;
class CarName {
	String carName;
	String carType;
	
	//assign values using constructor
	public carNew(Stringname , String type) {
		this.carName = name;
		this.carType = type;
		
	}
	//private method 
	private String getCarName() {
		return this.carName;
	}
	//inner class
	class Engine{
		String engineType;
		void setEngine() {
			if (CarNew.this.getCarName().equals("crysler")) {
				this.engineType = "Smaller";
			}else {
				this.engineType = "Bigger";
			}
		}
		String getEngineType() {
			return this.engineType;
		}
				
			}
			
		
	}

public class mainCar {
	public static void main(String[] args) {
		CarNew car1 = new CarNew("Honda","8WD");
	}
	public static void main(String[] args) {
		CarNew car1 = new CarNew("Honda","8WD");
		CarNew. Engine engine = car1.new Engine();
		engine.setEngine();
		System.out.println("Engine Type for 8WD ="+engine.getEngineType());
		
		CarNew car2 =new CarNew("crysler","4WD");
		CarNew.Engine engine2 =car2.new Engine();
		engine2.setEngine();
		System.out.println("Engine type for 4WD = "+engine2.getEngineType());
		
	}
}

