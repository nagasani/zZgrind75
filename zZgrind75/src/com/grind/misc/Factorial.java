package com.grind.misc;
public class Factorial {
    public static int factorial(int n) {
        // Base case: if n is 0 or 1, return 1
        if (n == 0 || n == 1) {
            return 1;
        }
        
        // Recursive case: call the factorial function with n-1
        // and multiply it by n
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        int number = 5;
        int result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}