public class Example1{
    public static void main(String args[]){
        System.out.println("Hi example1");
        Example2 e2=new Example2();
        e2.showMessage();
    }
} 

class Example2{
    public void showMessage(){
        System.out.println("example 2 class ");
    }
}