package com.tka;

public class Operation {
	
	
	public static String evenOdd(int number) {
		if (number % 2 == 0) {
           return ""+ number +" is even"; 
        } else {
        	return ""+ number +" is odd"; 
        }

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
		
		if(number<=0)
			return "";
		if(number==1)
			return "0";
		 StringBuilder sb=new StringBuilder("0,1");
		 int prev=0;
		 int curr=1;
		 
		 for(int i=2;i<number;i++) {
			 int next =prev+curr;
			 sb.append(",").append(next);
			 prev=curr;
			 curr=next;
		 }
		
		return sb.toString();
	}


	public static int add(int i, int j) {
		
		return 0;
	}
	
	public static int subtract(int i, int j) {
		return 0;
	}
	
	public static int multiply(int i, int j) {
		return 0;
	}

	public static int divide(int i, int j) {
		return i/j;
	}
	
	
}
