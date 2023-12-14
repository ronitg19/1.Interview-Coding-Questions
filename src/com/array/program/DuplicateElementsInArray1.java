package com.array.program;

public class DuplicateElementsInArray1 {

	public static void main(String[] args) {
		int a[] = new int[] {0,1,2,3,2,3,0,3};
		for(int i=0; i<a.length-1; i++) {
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					//a[j]=0;
					System.out.print(a[j]+ " ");
				}	
			}
//			if(a[i]!=0) {
//				System.out.print(a[i]+ " ");
//			}
		}
	}
}
