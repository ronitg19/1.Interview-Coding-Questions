package com.array.program;

public class AscendingOrderCharacterArray {

	public static void main(String args []) {
		
		char ch[] = {'b','a','d','c'};
		char temp = ' ';
		for(int i=0; i<ch.length; i++) {
		 for(int j=i+1; j<ch.length; j++) {
			 if(ch[i] > ch[j] ) {
				 temp = ch[i];
				 ch[i] = ch[j];
				 ch[j] = temp; 
			 }
		 }	
		}
		System.out.println("Elements in Array in Ascending order are..");
		//by for each loop
		for(char x : ch) {
			System.out.print(x +" ");
		}
		//note: We can print only character array directly without using for each loop 
		System.out.print(ch);
	}
}
