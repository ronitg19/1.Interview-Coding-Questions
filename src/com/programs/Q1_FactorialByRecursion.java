package com.programs;

public class Q1_FactorialByRecursion {
    public static int getFactorial(int n) {
    	if(n==0) {
    		return 1;
    	}else{
    		return n*getFactorial(n-1);	
    	}	
    }
	public static void main(String[] args) {
		int num = 5;
		int factorial = getFactorial(num);
        System.out.println("Factorial of "+num+" is " +factorial);
	}
}
