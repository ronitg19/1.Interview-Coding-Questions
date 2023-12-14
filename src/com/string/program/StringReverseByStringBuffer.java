package com.string.program;

public class StringReverseByStringBuffer {

	public static void main(String[] args) {
		String str = "I Love Java";
		StringBuffer stringBuffer = new StringBuffer(str);
		StringBuffer rev = stringBuffer.reverse();
        System.out.println("Reverse of "+str+ " is "+rev);
	}
}
