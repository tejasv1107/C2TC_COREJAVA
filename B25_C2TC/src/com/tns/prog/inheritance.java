package com.tns.prog;
class withdraw //base class
{
	int amt_withdraw=2000;
}

public class inheritance  extends withdraw{//child class
	int amt_left=5000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inheritance ob1= new inheritance();//always create an object of child class
		System.out.println("amountwithdraw"+ ob1.amt_withdraw);
	}

}
