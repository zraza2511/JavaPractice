package com.tw.datatype;

public class DtatTypeTest {
	public static void main(String[] args) {
		
		byte byteval=127;
		short shortval=222;
		int intval=10;
		long longval=-129;
		
		
		System.out.println("byteval :"+byteval);
		System.out.println("shortval :"+shortval);
		System.out.println("intval :"+intval);
		System.out.println("longval :"+longval);
		
		//Implicit type conversion
		//converting lowest range data type to highest range data type
		//assigning lowest rang value to highest rang value
		//If we convert byte to long or any highest rang data type it will give compile time error 
		//Type mismatch: cannot convert from long to byte
		
		
		long conlongval=byteval;
		int conintval=shortval;
		System.out.println("byte assign to long "+conlongval + " short assign to int "+conintval);
		
		//Explicit type conversion
		//converting high range data type low rang data type 
		
		byteval =(byte) longval;
		System.out.println(byteval);
		//In Java, a byte can contain only values from -128 to 127, if we try to cast a long value above or below the limits of the byte then there will be a precision loss. 1. byte: The byte data type is an 8-bit signed two's complement integer
		//precision loss
		
		//boolean we can not convert 
		boolean b=false;
		// byteval =b; Type mismatch: cannot convert from boolean to byte
	}

}
