import java.util.Random;
import java.util.Scanner;

public class OddsAndEvens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Let’s play a game called “Odds and Evens");
		System.out.println("What is your name?");
		String name = input.next();
		System.out.println("hi "+ name + " which do you choose? (O)dds or (E)vens?");
		String ans = input.next();
		if(ans.equals("O"))
		System.out.println(name+" has picked odds! The computer will be evens.");
		else
		System.out.println(name+" has picked evens! The computer will be odds.");
		System.out.println("How many “fingers” do you put out?");
		int num = input.nextInt();
		Random rand = new Random();
		int computer = rand.nextInt(6);
		System.out.println("The computer plays " + computer);
		int sum = computer + num;
		System.out.println("sum is "+ sum);
		boolean oddOrEven = sum % 2 == 0;
		if(oddOrEven) {
			   // Executes when the Boolean expression is true
			System.out.println("sum is even");
			}else {
			   // Executes when the Boolean expression is false
				System.out.println("sum is odd");
			}
				System.out.println("----------------------");
				System.out.println("the result of the game is:");
				if((sum%2==0 && num%2==0)||(sum%2!=0 && num%2!=0))
				System.out.println(name+" wins");
				else
			    System.out.println(name +" loses");
				
	
	}

}
