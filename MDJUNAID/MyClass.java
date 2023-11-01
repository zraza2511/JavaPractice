public class MyClass{
private String message;
public MyClass(String msg){
this.message = msg;
}
public void displayMessage(){
System.out.println(message);
}
public static void main(String[]args){
MyClass obj = new MyClass("java Is Fun!");
obj.displayMessage();
}
}