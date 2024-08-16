import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame
{
	public static void main(String args[])
	{
		Random random=new Random();
		int numberToGuess=random.nextInt(100)+1;
		//generate a random number between 1 to 100
		int guess;
		int attempts=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the number Guessing Game!");
		System.out.println("i've thought of a number between 1 and 100. ");
		
		while(true)
		{
			System.out.print("Enter your Guess:");
			guess=sc.nextInt();
			attempts++;
			
			if(guess==numberToGuess)
			{
				System.out.print("congrats! you guessed the number in" +attempts+"attempts");
				break;
			}
			else if(guess<numberToGuess)
			{
				System.out.println("Too Low.");
			}
			else 
			{
				System.out.println("Too High.");
			}
						
		}
		sc.close();
	}
}