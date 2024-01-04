package com.tw.datatype;

public class Operators {

	public static void main(String[] args) {
		int x=10;
		int y=20;
		int z=30;
		//Arithmetics Operators
	  z=x+y;
	  System.out.println("Addition= "+z);
	  z=y-x;
	  System.out.println("Substraction= "+z);
	  z=x*y;
	  System.out.println("Multiplication= "+z);
	  z=x/y;
	  System.out.println("Division= "+z);
	  z=x/y;
	  System.out.println("Modulus= "+z);
	  
	  //Unary Operators
	  ++x;
	  System.out.println("Pre Increment= "+x);
	  x++;
	  System.out.println("Post Increment= "+x);
	  --x;
	  System.out.println("Pre Decrement= "+-x);
	  x--;
	  System.out.println("post Decrement= "+-x);
	  
	  System.out.println("Logical Not= "+z);
	  
	  //Assignment Operators
	  y+=z;
	  System.out.println("Plus Equal To= "+y);
	  y-=z;
	  System.out.println("Minus Equal To= "+y);
	  y*=z;
	  System.out.println("Multi Equal To= "+y);
	  z/=x;
	  System.out.println("Div Equal To= "+z);
	  
	  //Relational Operators
	 
     if(x==y){	  
    	 System.out.println("This Condition Is Right");
     }
     else {
    	 System.out.println("This Condition Is Wrong");
     }
	 
     if(x!=y){	  
    	 System.out.println("This Condition Is Right");
     }
     else {
    	 System.out.println("This Condition Is Wrong");
     }
     
     if(x<=y){	  
    	 System.out.println("This Condition Is Right");
     }
     else {
    	 System.out.println("This Condition Is Wrong");
     }
     
     if(x>=y){	  
    	 System.out.println("This Condition Is Right");
     }
     else {
    	 System.out.println("This Condition Is Wrong");
     }
     
     // Logical Operator
     
     if((y<z)&&(z>y)){	  
    	 System.out.println("This Condition Is Right");
     }
     else {
    	 System.out.println("This Condition Is Wrong");
     }
     
     if((x==y)||(z>y)){	  
    	 System.out.println("This Condition Is Right");
     }
     else {
    	 System.out.println("This Condition Is Wrong");
     }
     
     if(!(x==y)&&(z>y)){	  
    	 System.out.println("This Condition Is Right");
     }
     else {
    	 System.out.println("This Condition Is Wrong");
     }
	  
		
  }
 
 } 
