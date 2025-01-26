package com.array.program;

public class A3_AscendingOrderIntegerArray {

	public static void main(String[] args) {
		int a[] = new int[3];
		a[0] = 5;
		a[1] = 4;
		a[2] = 3;
		
		int temp = 0;
		
		for(int i=0; i<a.length-1; i++) //here we can take i<a.length also 
			//but it will iterate loop one more time which is useless
		{
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
