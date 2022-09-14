package com.tns.assignment;

import java.util.Scanner;

public class Assignment_waterconservation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int water = sc.nextInt();
		if(water<=45) {
			System.out.println("no tax");
		}
		else if(water>45&&water<=75) {
			System.out.println("tax is 475");
		}
		else if(water>75&&water<=125) {
			System.out.println("tax is 750");
		}
		else if (water>125&&water<=200) {
			System.out.println("taxi is 1225");
		}
		else if (water>200&&water<=350) {
			System.out.println("tax is 1650");
		}
		else
		{
			System.out.println("tax is 2000");
		}

	}

}
