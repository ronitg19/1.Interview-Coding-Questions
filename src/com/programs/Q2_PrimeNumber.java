package com.programs;
import java.util.Scanner;
public class Q2_PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = scanner.nextInt();
		int count = 0;
		
		if(number>1) {
	
		for(int i=1; i<=number; i++) {
			if(number%i==0) {
				count++;
			}
		}
		if(count==2) {
				System.out.println(number+" is  prime number");
		}else{
			    System.out.println(number+" is not prime number");
		}
		
		}else{
			    System.out.println(number+" is not prime number");
		}
		scanner.close();
	}
}
