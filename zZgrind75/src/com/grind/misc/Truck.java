package com.grind.misc;

public class Truck implements Vehicle{

	@Override
	public void start() {
		System.out.println("Truck Started");
	}

	@Override
	public void stop() {
		System.out.println("Truck Stopped");
	}

	@Override
	public void running() {
		System.out.println("Truck running");
	}
}
