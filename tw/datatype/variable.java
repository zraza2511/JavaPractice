package com.tw.datatype;

public class variable {
	int a=10;
	int b=20;
	int c=0;
static String s;

	public static void main(String[] args) {
		
		variable var=new variable();
		var.calci(var.a,var.b,var.c);
	}
	public void calci(int a1,int b1,int c1) {
		
		c1=a1+b1;
		System.out.println("Addition= "+c1);
		c1=a1-b1;
		System.out.println("Substraction= "+c1);
		c1=a1*b1;
		System.out.println("Multiplication= "+c1);
		c1=a1/b1;
		System.out.println("Division= "+c1);
	}

}
