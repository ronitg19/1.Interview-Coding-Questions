package com.programs;
//Print 1 to 100 using recursion
public class RecursionDemo {
	public  static void print(int num) {
		if(num>0) {
			print(num-1);
			System.out.println(num+ " ");
		}
	}
	public static void main(String[] args) {
		print(100);
	}
}
