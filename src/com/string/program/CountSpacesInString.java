package com.string.program;

public class CountSpacesInString {

	public static void main(String[] args) {
		String str = "I Love Java";
        int counter = 0;
        
        for(int i=0; i<str.length(); i++) {
        	char ch = str.charAt(i);
        	if(ch == ' ') {
        		counter++;
        	}
        }
        System.out.println("Total spaces in String are "+counter);
	}
}
