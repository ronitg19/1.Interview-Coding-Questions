package com.programs;

public class FactorialByRecursion {
    public static int getFactorial(int n) {
    	if(n==0) {
    		return 1;
    	}else{
    		return n*getFactorial(n-1);	
    	}	
    }
	public static void main(String[] args) {
		int factorial = getFactorial(0);
        System.out.println("Factorial of number is " +factorial);
	}
}
