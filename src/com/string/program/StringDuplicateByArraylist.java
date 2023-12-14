package com.string.program;

import java.util.*;

public class StringDuplicateByArraylist {

	public static void main(String[] args) {
		String str = " I Love Java";
		char[] ch = str.replace(" ", "").toCharArray();
		
		List<Character> list = new ArrayList<Character>();
		Set<Character>  set =new HashSet<Character>();
		
		for(int i=0; i<ch.length; i++) {
			if(set.contains(ch[i])) {
				list.add(ch[i]);
			}else {
				set.add(ch[i]);
			}
		}
		System.out.println("Duplicate letters in String are "+list);
	}
}
