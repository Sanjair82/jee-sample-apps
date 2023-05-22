package com.dayone;

import java.util.Scanner;

public class Fibonacci {

	public static int fibonacciNum(int num) {
		int a=1;                      //first 2 numbers in fibonacci series are 1,1
		int b=1;
		int c=0;
		
		if(num==0) {
			return 0;
			}
		for(int i=2;i<num;i++) {
				c=a+b;                  //adding previous 2 numbers
				a=b;                    
				b=c;
			}
		return b;
		
	}
	public static int fibonacciRecursive(int num){ //fibonacci using recursive method
		if(num==0) {
			return 0;
		}
		else if(num<=2){
			return 1;
		}
		else {
				return ((fibonacciRecursive(num-1)+ fibonacciRecursive(num-2)));  //recursive method
		}
	
	}
	public static void main(String Args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=sc.nextInt();
		System.out.println(fibonacciNum(number));
		System.out.println("recursive: "+fibonacciRecursive(number));
		sc.close();
	}
}
