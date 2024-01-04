package com.tw.jump;

public class JumpStatmentTest {

	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5,6,7,8,9,10};
		
//		for (int i = 0; i < a.length; i++) {
//			
//			int j = a[i];
//			if(j % 2 == 0) 
//				continue;
//			
//			System.out.println("odd number " +j);
//			
//		}
		
		
		for (int i = 0; i < a.length; i++) {
			int j = a[i];
			
			if(j > 0 && j!=4)
				continue;
			
			System.out.println(j);
			
		}

	}

}
