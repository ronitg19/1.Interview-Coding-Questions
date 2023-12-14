package com.string.program;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;


public class StringDuplicateByHashSet {

	public static void main(String[] args) {
		String str  ="Successfully";
		char[] ch = str.toCharArray();
		
		Set<Character> set = new HashSet<Character>();
        Set<Character> set1 = new LinkedHashSet<Character>();
        
        
        for(char x:ch) {
        	if(!set.add(x) && x != ' ') {
        		set1.add(x);
        	}
        }
        System.out.println("Duplicate letters in "+"'"+str+"'"+ " are "+set1);
	}
}
