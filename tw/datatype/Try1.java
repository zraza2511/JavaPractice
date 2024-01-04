package com.tw.datatype;

public class Try1 {
public int a=10;
public int b=20;
public int c=30;
public static String str;
	public static void main(String[] args) {
	
       Try1 T=new Try1();
       T.calci(T.a,T.b,T.c);
	}
       public void calci(int a1,int b1,int c1)
       {
    	   
       c1=a1+b1;
       System.out.println("Addition: "+c1);
       c1=a1-b1;
       System.out.println("Substraction: "+c1);
       c1=a1*b1;
       System.out.println("Multiplication: "+c1);
       c1=a1/b1;
       System.out.println("Division: "+c1);
       
       }
	}
