package com.tns.assignment;

import java.util.Scanner;

public class Assignment_library {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int fine;
		System.out.println("enter the number of days late"+days);
		if(days<=5) {
			fine= days*1;
		}
		else if (days<=10){
			fine= (5*1)+(days-5)*5;
		}
		else {
			fine=(5*1)+(5*5)+(days-10)*10;
			
		}
        System.out.println("For"+days+"days late.fine is"+fine);
	}

}