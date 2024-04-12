package com.grind.misc;

public class AutoShop {

	
	public static void main(String[] args) 
	{
		//Vehicle car = new Car();
		var truck = new Truck();
		VehicleOperation op = new VehicleOperation(truck);
		op.run();
	}
}
