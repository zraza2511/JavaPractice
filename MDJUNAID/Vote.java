// input age >=18----->vote
// input age<18-----> not

import java.util.Scanner;

public class Vote{
public static void main(String[] args){

int age;
System.out.print("Enter Your Age ");
Scanner r=new Scanner(System.in);
age=r.nextInt(); // 20

if(age>=18) // 20>=18
{
System.out.println("Eligible For Votes ");
}
else
{
System.out.println("Not Eligible For Votes ");
}
}
}