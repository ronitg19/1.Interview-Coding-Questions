package com.array.program;

import java.util.Arrays;

public class DuplicateElementCountWithSortig {

	public static void main(String[] args) {
		int a[] = {2,2,4,2,2,4,5,6,6};
        Arrays.sort(a); //after sorting.. 2,2,2,2,4
        int count;
		for(int i=0; i<a.length; i++) {
			count=1;
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					count++;
					//a[j]= 0;
				}else
					break;
			}
            if(count>1 ) {
				System.out.println(a[i]+ " is repeated  "+count+ " times");
				i+= (count-1); //here count is 4,so i => 0+3=3
			}	
		}
	}
}
