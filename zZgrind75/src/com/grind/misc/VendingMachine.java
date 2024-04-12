package com.grind.misc;

import java.util.Scanner;

public class VendingMachine {

	private static final double cokePrice  = 1.50d;
	private static final double pepsePrice = 1.75d;
	private static final double waterPrice = 2.00d;
	private int dollars;
	private int quarters;
	private int cents;
	
	public VendingMachine(int dollars, int quarters, int cents) 
	{
		this.dollars = dollars;
		this.quarters = quarters;
		this.cents = cents;		
	}
	
	public static void main(String[] args) 
	{
		VendingMachine  vm = new VendingMachine(10, 50, 25);
		double total = vm.dollars + (vm.quarters*.25d) + (vm.cents*.01d);
		
		try (Scanner scanner = new Scanner(System.in)) 
		{
			System.out.println("Enter your first Product: "); 
			String firstProdcut = scanner.nextLine();
			
			System.out.println("Enter your second Product: "); 
			String secondProduct = scanner.nextLine(); 
			
			System.out.println("Enter Cash: "); 
			int cash = scanner.nextInt(); 
			
			scanner.nextLine();
			
			double cost = 0;
			
			if(firstProdcut.equalsIgnoreCase("C")) 
			{
				cost = cost + (2*cokePrice);
			}        
			else if(firstProdcut.equalsIgnoreCase("P"))
			{
				cost = cost + (2*pepsePrice);
			}        
			else if(firstProdcut.equalsIgnoreCase("W")) 
			{
				cost = cost + (2*waterPrice);
			}
			
			if(secondProduct.equalsIgnoreCase("C"))
			{
				cost = cost + (2*cokePrice);
			}        
			else if(secondProduct.equalsIgnoreCase("P"))
			{
				cost = cost + (2*pepsePrice);
			}        
			else if(secondProduct.equalsIgnoreCase("W"))
			{
				cost = cost + (2*waterPrice);
			}
			
			double change = cash - cost;
			
			vm.dollars = vm.dollars+cash;
	
			System.out.println("Your change "+change +" = "+(change > 1 ? (change/1) : "0")+" dollar and "+(change > 1 ? (change/1) : "0") + " quarters and "+ vm.cents+ " centes");
			System.out.println("Money left in Vending Machine "+(total+cost)+" = "+vm.dollars+" dollar and "+vm.quarters + " quarters and "+ vm.cents+ " centes");
		}
	}
	
}
