package com.grind.misc;

import java.io.*;
import java.util.*;

public class LamdaExample {

	public static void main(String[] args) throws IOException {
		MyMath ob = new MyMath();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		PerformOperation op;
		boolean ret = false;
		String ans = null;
		while (T-- > 0) {
			String s = br.readLine().trim();
			StringTokenizer st = new StringTokenizer(s);
			int ch = Integer.parseInt(st.nextToken());
			int num = Integer.parseInt(st.nextToken());
			if (ch == 1) {
				op = ob.isOdd();
				ret = ob.checker(op, num);
				ans = (ret) ? "ODD" : "EVEN";
			} else if (ch == 2) {
				op = ob.isPrime();
				ret = ob.checker(op, num);
				ans = (ret) ? "PRIME" : "COMPOSITE";
			} else if (ch == 3) {
				op = ob.isPalindrome();
				ret = ob.checker(op, num);
				ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

			}
			System.out.println(ans);
		}
	}
}

class MyMath {
	public static boolean checker(PerformOperation p, int num) {
		return p.check(num);
	}

	public PerformOperation isPalindrome() {
		PerformOperation p =  (a) -> {
            String word = ""+a;
            boolean isPalindrome = true;
            for(int i = 0;i<(int)word.length()/2;i++)
            {
                if(word.charAt(i) != word.charAt(word.length()-1-i)){
                    isPalindrome = false;
                    break;

                }
            }
            return isPalindrome;
         };
         return p;
	}

	  public PerformOperation isPrime() {
	        PerformOperation p = x ->
	        {
	           if(x==1) return true;
	           else
	           {
	               for(int i=2; i < x/2; i++){
	                   if(x%i == 0){
	                       return false;
	                   }
	               } 
	           }
	            return true;
	        }; 
	        return p;
	    }

	public PerformOperation isOdd() {
		PerformOperation p = x -> x%2==1 ? true:false;
		return p;
	}

	

}

@FunctionalInterface
interface PerformOperation {
	 boolean check(int a);
	}
