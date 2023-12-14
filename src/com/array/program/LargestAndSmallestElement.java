
package com.array.program;

public class LargestAndSmallestElement {

	public static void main(String[] args) {
		int a[] = new int [5];
		a[0]=5;
		a[1]=4;
		a[2]=3;
		a[3]=2;
		a[4]=1;
		int max = a[0]; //is 2 is greater than max?
		int min = a[0]; // is 2 is less than min?
	    
		for(int i=0; i<a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
			if(a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Largest number is "+max);
		System.out.println("Smallest number is "+min );
	}
}
