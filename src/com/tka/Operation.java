package com.tka;

public class Operation {
	
	public static String evenOdd(int number) {
       return null;
    }
	
	
	public static String prime(int number) {
		return null;
	}

	
	public static String palindrome(int number) {
		return null;
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
}
