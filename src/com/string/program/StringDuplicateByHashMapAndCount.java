package com.string.program;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateByHashMapAndCount {

	public static void main(String[] args) {
		String str = "aaaaffff cccchhhaw";
		Map<Character, Integer> map = new HashMap<>();
		char[] charr = str.replace(" ", "").toCharArray();
		for(char ch: charr) {
			if(map.containsKey(ch)) {
				map.put(ch,map.get(ch)+1);
			}else 
			{
				map.put(ch,1);
			}
		}
		map.entrySet().removeIf(i -> i.getValue()==1);
		System.out.println(map);
	}
}
