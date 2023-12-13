import java.util.Scanner;
public class Admin{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your name: ");
		String name=sc.nextLine();
		
		System.out.println("please enter your age: ");
		int age=sc.nextInt();
		
		String eligible ="";
		if(age >= 18){
			eligible ="Y";
		}else{
			eligible ="N";
		}
		
		System.out.println("Hi "+name + " ur age is "
		+age + " your eligibility for vote "+eligible);
	}
}
