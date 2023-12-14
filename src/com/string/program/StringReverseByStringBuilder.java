package com.string.program;

public class StringReverseByStringBuilder {

	public static void main(String[] args) {
		String str = "tinoR";
		StringBuilder stringBuilder = new StringBuilder(str);
		StringBuilder rev = stringBuilder.reverse();
        System.out.println("Reverse of "+str+ " is "+rev);
	}
}
