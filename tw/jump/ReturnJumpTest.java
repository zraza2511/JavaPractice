package com.tw.jump;

public class ReturnJumpTest {

	public static void main(String[] args) {

		System.out.println(getName());
		ReturnJumpTest obj=new ReturnJumpTest();
		
		double returnaddval =obj.add(100, 100);
		System.out.println(returnaddval);
		
		System.out.println(obj.sub(100, 100));
		
	}
	
	public static String getName() {
		
		String name="xyz";
		return name;
	}
	
	public double add(double a,double b) {
		return a+b;
	}
	
	public double sub(double a,double b) {
		return a -b;
	}

}
