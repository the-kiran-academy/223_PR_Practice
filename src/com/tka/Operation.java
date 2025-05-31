package com.tka;

public class Operation {
	
	
	public static String evenOdd(int number) {
       return null;
    }
	
	
	public static String prime(int number) {
		return null;
	}

	
	public static String palindrome(int number) {
	    int original = number;
	    int reversed = 0;

	    while (number > 0) {
	        int digit = number % 10;
	        reversed = reversed * 10 + digit;
	        number /= 10;
	    }

	    if (original == reversed) {
	        return "Palindrome";
	    } else {
	        return "Not a Palindrome";
	    }
	}

	
	public static String fibonacci(int number) {
		return null;
	}
}
