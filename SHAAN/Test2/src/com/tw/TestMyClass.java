package com.tw;

public class TestMyClass {
	
	// Syntax error on token "class", invalid VariableDeclaratorId
	// int class=10;
	
	public static void main(String[] args) {
		printArray();
	}

	//  123m1() Syntax error on token "123", delete this token
	// @m1()  Syntax error on token "@", delete this token
	public void addNumInVaraibles() {
		//Syntax error on token "1", delete this token
		int i_1=10;
	}
	
	
	static int a[]= {10,20,30,40,50};
	public static void printArray() {
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
	}
}
