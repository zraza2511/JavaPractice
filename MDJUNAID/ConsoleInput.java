import java.util.Scanner;
public class ConsoleInput{
public static void main (String[]args){
Scanner scanner=new
Scanner(System.in);
System.out.print("Enter Your Name:");
String name=scanner.nextLine();
System.out.println("Hello,"+name);
scanner.close();
}
}