package com.tns.prog;

import java.util.Scanner;
public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		// declare the object and initialise with
		//predefined standard input object
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the character");
		
		
		//character input 
		char c = sc.next().charAt(0);
		
		//Print the read value 
		System.out.println("c ="+c);	
		}

}
