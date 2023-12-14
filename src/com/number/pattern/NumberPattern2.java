package com.number.pattern;

public class NumberPattern2 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			int k=1;
			for(int j=4; j>=i; j--) {
				
				System.out.print(k++);
			}
			System.out.println();
		}
	}
}
