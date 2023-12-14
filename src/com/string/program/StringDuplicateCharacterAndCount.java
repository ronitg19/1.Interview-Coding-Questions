package com.string.program;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class StringDuplicateCharacterAndCount {

	public static void main(String[] args) {
		String str = "Successfully";
		int count;
		char[] ch = str.toCharArray();
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		
		for(int i=0; i<ch.length; i++) {
			count =1;
			for(int j =i+1; j<ch.length; j++) {
				if(ch[i]==ch[j] && ch[i]!= ' ') {
					count++;
					ch[j]='0';
				}
			}
			if(count>1 && ch[i] !='0') {
				map.put(ch[i], count);
				//System.out.println(ch[i]+ " is repeated "+count+ " times");
			}
		}
		Set<Character> ks = map.keySet();
		Iterator<Character> itr = ks.iterator();
		while(itr.hasNext()) {
			Character cha = itr.next();
			System.out.println(cha+ " = "+map.get(cha));
		}
	}
}
