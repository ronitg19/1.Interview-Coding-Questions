package com.programs;

public class P1_SwappingOfTwoNo_WithoutThirdVariable {

	public static void main(String[] args) {
		int x = 5;
		int y = 10;
		System.out.println("Value Of X and Y Before Swapping :: X = "+x+" And Y = "+y);
		x= x+y;
		y = x-y;
		x = x-y;
		
		System.out.println("Value Of X and Y After Swapping :: X = "+x+" And Y = "+y);
		
	}

}
