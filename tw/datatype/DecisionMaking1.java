package com.tw.datatype;

public class DecisionMaking1 {

	public static void main(String[] args) {
		int ListTime[] = { 9, 12, 15, 18, 21, 24};
		
		for (int time : ListTime) {
	     if ( time <25) {
	     if (time >12) {
			System.out.println("Good Morning");
		}else if (time < 30){
			System.out.println("Good Evening");
		}else {
			System.out.println("Good Night");
		}
		}
		}
	}
}

      
       

