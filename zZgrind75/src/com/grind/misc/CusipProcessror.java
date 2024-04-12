package com.grind.misc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class CusipProcessror {
	
	public static void main(String[] args) throws FileNotFoundException {		
		Scanner scanner = new Scanner(new File("C:\\Users\\nagas\\Downloads\\cusip.txt"));
		String line = scanner.nextLine();
		Float max = Float.MIN_VALUE;
		Float min = Float.MAX_VALUE;
		String ticker = "";				
		boolean theEnd = false;
		while(line != null || theEnd) 
		{
			if(theEnd || !line.contains(".")) 
			{
				if(theEnd || !ticker.equals("")) 
				{
					try(FileOutputStream fo = new FileOutputStream("C:\\Users\\nagas\\Downloads\\cusipO.txt")) 
					{
						System.out.println(ticker+" - "+min+" - "+max);
						fo.write((ticker+" - "+min+" - "+max).getBytes());
					} 
					catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
					catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					if(theEnd)
					{
						theEnd = false;
						break;
					}
				}
				ticker = line;
				max = Float.MIN_VALUE;
				min = Float.MAX_VALUE;				
			}
			else 
			{
				max = Math.max(max, Float.parseFloat(line));
				min = Math.min(min, Float.parseFloat(line));
			}
			line = scanner.hasNextLine() ? scanner.nextLine() : null;
			theEnd = line == null ? true : false;
		}
		scanner.close();
	}

}
