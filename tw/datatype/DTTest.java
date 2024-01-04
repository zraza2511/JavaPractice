package com.tw.datatype;

public class DTTest {
	public static void main(String[]args) {
		
		// Implicit Type Conversion
		//Lower to Higher Range Data Type
		
		char charval='1';
		int intval=charval;
		
		byte byteval=120;
		short shortval=byteval;
		
        short shortvalue=32760;
        int intvalue=shortval;
        
        int intvalues=21474836;
        long longval=intvalues;
        
        long longvalue=92233720368580l;
        float floatval=longvalue;
        
        float floatvalue=90.123f;
        double daboubleval=floatvalue;
        
        //Explicit Type Conversion
        //Higher To Lower Range Data Type
        
        long lonvl=2147483;
        int intvl=(int) lonvl;
        
        int intevl=32760;
        short shortvl=(short) intevl;
        
        short shortvla=120;
        byte bytval=(byte) shortvla;
        
        
        
		
		System.out.println("intvalue :"+charval);
		System.out.println("shortvalue :"+byteval);
		System.out.println("Intvalue :"+shortvalue);
		System.out.println("longval :"+intvalues);
		System.out.println("floatval :"+longvalue);
		System.out.println("doubleval :"+floatvalue);
		System.out.println("intvl :"+lonvl);
		System.out.println("shortvl :"+intevl);
		System.out.println("bytval :"+shortvla);
		
		
		
		
		
	}
	}

