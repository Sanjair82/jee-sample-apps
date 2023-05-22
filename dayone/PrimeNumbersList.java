package com.dayone;

import java.util.Scanner;

public class PrimeNumbersList {

	public static void primeList(int number) {
		for(int loop1=2;loop1<=number;loop1++) { //looping from 2 to the number
			int flag=0;            //using flag
			for(int loop2=2;loop2<=loop1/2;loop2++) {
				if(loop1%loop2==0) {   //check the number is prime or not
					flag=1;       //changing the  flag to 1 if non prime number
					break;     //breaking the 2nd loop
				}
			}
			if(flag==0) {
				System.out.println(loop1);
			}
		}
		return;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int number=sc.nextInt();
		primeList(number);
		
	}
}
