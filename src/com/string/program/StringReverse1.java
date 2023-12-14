package com.string.program;

public class StringReverse1 {

	public static void main(String[] args) {
		String str = "tinoR";
		char[] ch = str.toCharArray();
		String rev = " ";
        for(int i=ch.length-1; i>=0; i--) {
        	rev += ch[i];
        }
        System.out.println("Reverse of "+str+ " is "+rev);
	}
}
