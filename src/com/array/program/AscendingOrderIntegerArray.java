package com.array.program;

public class AscendingOrderIntegerArray {

	public static void main(String[] args) {
		int a[] = new int[5];
		a[0] = 3;
		a[1] = 4;
		a[2] = 5;
		a[4] = 2;
		a[3] = 1;
		int temp = 0;
		
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Elements of Arrar in Ascending Order are..");
		
		for(int x:a) {
			System.out.print(x + " ");
		}
	}
}
