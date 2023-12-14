package com.programs;

public class PerfectNumber {

	public static void main(String[] args) {
		int input=28;
		int sum=0;
		int i=1;
		while(i<input) {
			if(input%i==0) {
				sum +=i;
			}i++;
		}
		if(input==sum) {
			System.out.println(input+" is a Perfect Number");
		}else {
			System.out.println(input+" is not a Perfect Number");
		}
	}
}
