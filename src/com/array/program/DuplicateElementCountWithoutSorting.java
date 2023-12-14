package com.array.program;

public class DuplicateElementCountWithoutSorting {

	public static void main(String[] args) {
		int a[] = {2,3,2,3,2,4,5,3,3,3};
		int count;
        for(int i=0; i<a.length; i++) {
        	count=1;
        	for(int j=i+1; j<a.length; j++) {
        		if(a[i]==a[j]) {
        			count++;
        			a[j]=0;
        		}
        	}
        	if(count>1 && a[i]!=0) {
        		System.out.println(a[i]+ " is repeated "+count+ " times");
        	}
        }
	}
}
