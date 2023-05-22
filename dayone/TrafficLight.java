package com.dayone;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Choose a color!! r for Red, y for Yellow,  g for Green :"); 
	String l=sc.nextLine(); //getting user input
	String light=l.toLowerCase();
	
switch(light) { //using switch case to compare input
    case "r":{
	System.out.println("STOP!!");
	break;
	}
	case "y":{
		System.out.println("READY!!");
		break;
	}
	case "g":{
		System.out.println("GO!!");
		break;
	}
	default:
		System.out.println("try again");
	}
	
	
//	if(light.equals("r")) {
//		System.out.println("STOP!!");
//	}
//	else if(light.equals("y")) {
//		System.out.println("READY!!");
//	}
//	else if(light.equals("g")) {
//		System.out.println("GO!!");
//	}
//	else {
//		System.out.println("try again");
//	}
}
}