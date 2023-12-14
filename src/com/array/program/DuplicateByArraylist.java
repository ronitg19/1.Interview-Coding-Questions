package com.array.program;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateByArraylist {

	public static void main(String[] args) {
		int a[] = new int[] {2,2,2}; //This method is also for only two same element,
		//for int a[]= {2,2,2}..it will fail
		List<Integer> list = new ArrayList<Integer>();
		Set<Integer>  set = new HashSet<Integer>();
        for(int i=0; i<a.length; i++) {
        	if(set.contains(a[i])) {
        		list.add(a[i]);
        	}else {
        		set.add(a[i]);
        	}
        }
        System.out.println("Duplicate Elemnts are "+list);
	}
}
