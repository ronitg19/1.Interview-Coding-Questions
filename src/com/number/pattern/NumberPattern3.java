package com.number.pattern;

public class NumberPattern3 {

	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
		for(int i=1; i<=4; i++) {
			int k=1;
			for(int j=3; j>=i; j--) {
				System.out.print(k++);
			}
			System.out.println();
		}
	}
}
