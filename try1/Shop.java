import java.util.Scanner;
public class Shop{
	public static void main(String args[]){
	
	
	Scanner sc=new Scanner (System.in);
	
	System.out.println("please enter product");
	String name=sc.nextLine();
 
	System.out.println("please enter your price: ");
	int price=sc.nextInt();
	
	System.out.println("please enter your qyt: ");
	int qyt=sc.nextInt();
	
	int sum=price*qyt;
	System.out.println("your bill is "+sum);
	
	
}
}