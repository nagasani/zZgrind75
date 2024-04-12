package com.grind.misc;

public class Car implements Vehicle 
{

	@Override
	public void start() {
		System.out.println("Car Started");
	}

	@Override
	public void stop() {
		System.out.println("Car Stopped");
	}

	@Override
	public void running() {
		System.out.println("Car running");
	}

}
