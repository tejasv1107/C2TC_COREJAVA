package com.tns.assignment;

import java.util.Scanner;
public class Assignment_Multipleof3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       
       if (number%3==0) {
    			   System.out.println("is Multiplrof3");
       }
    		   else {
    		   
    			   System.out.println( "is not multipleof 3");
    		   }
	}
	


}