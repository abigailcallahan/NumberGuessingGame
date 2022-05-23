import java.util.Scanner;

public class NumberGuessingGame
	{
		static int secretNumber = (int) (Math.random() * 5) + 1;
		static boolean stillGuessing = true;
		static Scanner userInput = new Scanner(System.in);
		static int counter = 0;
		static int guess;
		
		public static void main(String[] args)
			{
				introduction();
				guess();
				evaluateNumber();
				
			}
		
		public static void introduction()
				{
					System.out.println("Welcome to the number guessing game! Guess a number between 1-5");
				}
		public static void guess()
				{
					guess = userInput.nextInt();
				}
		public static void evaluateNumber()
				{
					do
						{
					if(guess > secretNumber) 
						{
							System.out.println("Too high, keep guessing");
							counter++;
							guess = userInput.nextInt();
						}
					else if(guess < secretNumber)
						{
							System.out.println("Too Low, keep guessing");
							counter++;
							guess = userInput.nextInt();
						}
					else if(guess == secretNumber)
						{
							System.out.println("Congrats, you guessed correctly!");
							stillGuessing = false;
							counter++;
							if(counter == 1)
								{
									System.out.println("It took you 1 try");
								}
							else
								{
									System.out.println("It took you " + counter + " tries");
								}
						}
					else
						{
							System.out.println("I do not think you entered a valid number, try again");
						}
						}
					while(stillGuessing);
				}
	}
