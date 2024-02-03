package com.programs;

import java.util.Scanner;

public class Q4_RangeOfPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the upper range");
		int upperLimit = scanner.nextInt();
		System.out.println("Prime numbers up to " + upperLimit + ":");
        for (int i = 2; i <= upperLimit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
            scanner.close();
            }
        }
		

	private static boolean isPrime(int num) {
        int count = 0;
		for(int i=1; i<=num; i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
				return true;
		}else{
			    return false;
		}
		
		}
}
