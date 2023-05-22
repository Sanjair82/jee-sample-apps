package com.dayone;
import java.util.*;
public class SumOfDigits {

	public static int sumOfCubesOfDigits(int num) {
		int sum=0;
		while(num>0) {        //looping until there are no digits left
			int digit=num%10;      //getting the last digit using reminder
			sum=sum+(digit*digit*digit);   //adding the sum of the last digits cube to the total sum
			num=num/10;     //removing the last digit from given number
		}
		return sum;
	}
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		int res= sumOfCubesOfDigits(num);
		System.out.println(res);
		sc.close();
	}
}
