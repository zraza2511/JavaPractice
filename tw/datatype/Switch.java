package com.tw.datatype;

public class Switch {

	public static void main(String[] args) {
	
		int ListWeek[]= {1,2,3,4};
		
		for(int week : ListWeek) {
			
		switch (week)  {
		case 1 : {
			System.out.println("First Week "+week);
			break;
		}
		case 2 : {
			System.out.println("Second Week "+week);
		    break;
		}
		case 3 : {
			System.out.println("Third Week "+week);
			break;
		}
		case 4 : {
			System.out.println("Fourth Week "+week);
			break;
		}
			default :
				System.out.println("Other Week "+week);
		}
		}
	}
}

