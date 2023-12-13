import java.util.Scanner;
public class Kricket{

	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first team:");
		String firstTeam=sc.nextLine();
		
		System.out.println("Enter second team:");
		String secondTeam=sc.nextLine();
		
		System.out.println("Who win the toss:");
		String tosWinTeam=sc.nextLine();
		
		System.out.println("Enter the score of First team:");
		int scoreFirst=sc.nextInt();
		
		System.out.println("Enter the score of Second team:");
		int scoreSecond=sc.nextInt();
		
		if(scoreFirst > scoreSecond){
			System.out.println("Congratulation team :" +firstTeam);
		}else{
			System.out.println("Congratulation team :" +secondTeam);
		}
	}
}