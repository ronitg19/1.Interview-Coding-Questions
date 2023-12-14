package com.array.program;

public class SecondLargestElement {

	public static void main(String[] args) {
		int a[] = {2,3,4,1,6,5};
		int temp;
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]<a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println("Second Largest Number is "+a[1]);
	}
}
