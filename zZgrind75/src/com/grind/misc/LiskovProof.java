package com.grind.misc;

public class LiskovProof 
{	
	public static void main(String[] args) 
	{
		LiskovService ll = new LiskovService();
		
		LiskovParent fiction = new LiskovFirstChild("1984", 8.99);
		LiskovParent nonFiction = new LiskovSecondChild("Sapiens", 12.99);

		System.out.println(ll.printBookDetails((nonFiction)));
		System.out.println(ll.printBookDetails((fiction)));
	}
}
