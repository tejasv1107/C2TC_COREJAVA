//programs on oops concepts

package com.tns.prog;

public class Oops_concepts {
	int year_ofpurchase;// datamembers or properties
    String make;
    int model;
    double cost;
    public void display1()//member function
    {
    	   System.out.println("yearof purs"+2001);
    	   System.out.println("make"+"suzuki");
    	   
    }
   void disp2()
   {
	   System.out.println("model"+1999);
	   System.out.println("make"+ 500000);
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Oops_concepts ob1 = new Oops_concepts();//object creation
		//Oops_concepts ob2= new Oops_concepts();
		ob1.display1();
		ob1.disp2();

	}

}
