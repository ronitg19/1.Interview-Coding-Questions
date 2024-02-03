//A Number is said to be Palindrome Number
//If Reverse of that number is equal to the original number
//Ex..111,121,14541.
package com.programs;
public class P3_PalindromeNumber {

	public static void main(String[] args) {
		int num= 12343;
		int temp=num;
		int rev=0;
		
		while(num !=0) {
			int remainder = num%10;
			rev = rev*10 + remainder;
			num = num/10;
		}
		if(rev==temp){
			System.out.println(temp+ " is Palindrome number");
		}else {
			System.out.println(temp+ " is not Palindrome number");
		}
	}
}
