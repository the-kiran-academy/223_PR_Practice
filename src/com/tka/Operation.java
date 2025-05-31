package com.tka;

public class Operation {
	
	public static String evenOdd(int number) {
       return null;
    }
	
	
	public static String prime(int number) {
		boolean prime=true;
		  if (number <= 1) {
	           prime = false;
	        } else {
	            for (int i = 2; i < number; i++) {
	                if (number % i == 0) {
	                    prime = false;
	                    break;
	                }
	            }
	        }
		 
		if (prime)
	            return number + " is a prime number.";
	        else
	            return number + " is not a prime number.";
	        
	}

	
	public static String palindrome(int number) {
		return null;
	}
	
	public static String fibonacci(int number) {
		return null;
	}
}
