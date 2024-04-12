package com.grind.misc;

public class VehicleOperation {
	
	Vehicle vehicle;
	
	public VehicleOperation(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public void run() {
		vehicle.start();
		vehicle.running();
		vehicle.stop();		
	}

}
