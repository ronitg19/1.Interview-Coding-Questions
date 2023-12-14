package com.array.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateByHashSet {

	public static void main(String[] args) {
		int a[] = {2,3,2,3,2,3,5,0,0};
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		
		for(Integer x:a) {
			if(set.add(x)==false) {
				set1.add(x);	
			}	
		}
		System.out.println(set1);
	}
}
