package com.grind.interviews;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//Wrong approach No need of saving data in collection
public class ProcessCusip {

	private static final Pattern CUSIP_PATTERN_CHECK = Pattern.compile("[A-Za-z0-9]{9}");
	private static final Pattern PRICE_PATTERN_CHECK = Pattern.compile("[0-9]*.[0-9]*");

	private static StringBuffer sb = new StringBuffer();

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		Scanner scanner = null;
		try {
			try {
				fis = new FileInputStream(
						"C:\\Users\\nagas\\eclipse-workspaceWells\\cusip\\src\\main\\resources\\cusips.txt");
			} catch (FileNotFoundException e) {
				System.err.println(e.getMessage());
			}
			scanner = new Scanner(fis, "UTF-8");
			boolean processCusipFlag = false;
			boolean firstCusip = false;
			List<BigDecimal> lst = new ArrayList<BigDecimal>();
			String cusipLast = "";
			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				Matcher matcherCusip = CUSIP_PATTERN_CHECK.matcher(line);
				if (matcherCusip.matches()) {
					if (!firstCusip) {
						firstCusip = true;
						processCusipFlag = false;
						cusipLast = line;
					} else {
						processCusipFlag = true;
					}
				} else {
					processCusipFlag = false;
					Matcher matcherPrice = PRICE_PATTERN_CHECK.matcher(line);
					if (matcherPrice.matches()) {
						lst.add(new BigDecimal(line));
					} else {
						System.err.println("Invalid Line : " + line);
					}
				}

				if (firstCusip && processCusipFlag) {
					System.out.println("Detail of : " + cusipLast);
					sb.append("Detail of Cusip : " + cusipLast + "\n");
					if (!lst.isEmpty()) {
						processCusip(cusipLast, lst);
					}
					lst = new ArrayList<BigDecimal>();
					cusipLast = line;
				}
			}
			if (!lst.isEmpty() && !cusipLast.equals("")) {
				System.out.println("Detail of Cusip : " + cusipLast);
				sb.append("Detail of Cusip : " + cusipLast + "\n");
				processCusip(cusipLast, lst);
				lst = new ArrayList<BigDecimal>();
			}
			if (sb != null && !sb.toString().equals("")) {
				try {
					fos = new FileOutputStream(
							"C:\\Users\\nagas\\eclipse-workspaceWells\\cusip\\src\\main\\resources\\cusips_out.txt");
					try {
						fos.write(sb.toString().getBytes());
					} catch (IOException e) {
						System.err.println(e.getMessage());
					}
				} catch (FileNotFoundException e) {
					System.err.println(e.getMessage());
				} finally {
					if (fos != null) {
						try {
							fos.close();
						} catch (IOException e) {
							System.err.println(e.getMessage());
						}
					}
				}
			}
		} finally {
			try {
				if (fis != null) {
					fis.close();
				}
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
			try {
				if (scanner != null) {
					scanner.close();
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
	}

	public static void processCusip(String cusip, List<BigDecimal> prices) 
	{
		System.out.println("Latest Cusip Price : " + prices.get(prices.size() - 1).toString());
		sb.append("Latest Cusip Price : " + prices.get(prices.size() - 1).toString() + "\n");
		List<BigDecimal> sortedList = prices.stream().sorted().collect(java.util.stream.Collectors.toList());
		System.out.println("Min Cusip Price : " + sortedList.get(0).toString());
		sb.append("Min Cusip Price : " + sortedList.get(0).toString() + "\n");
		System.out.println("Max Cusip Price : " + sortedList.get(prices.size() - 1).toString());
		sb.append("Max Cusip Price : " + sortedList.get(prices.size() - 1).toString() + "\n");
	}
}