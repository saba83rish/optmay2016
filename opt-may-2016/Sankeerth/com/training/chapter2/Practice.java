/**
 * 
 */
package com.training.chapter2;

import java.util.Scanner;

//import java.util.Scanner;

//import java.util.Scanner;

/**
 * @author reddy
 * Program to guess a random number in 10 trials 
 * chosen by the computer
 */
public class Practice{
	
	static int number;

	/**
	 * @param args
	 */
	public static void printRules() {
		System.out.println("Start the game");
		System.out.println("Enter a number");
		System.out.println("If the number is correct you won, else enter again");
		System.out.println("You lose if you fail to pick the number before 10 turns");
	}
	
	public static int generateNumber()
	{
		return (int)(Math.random() * 100);
	}

	public static boolean playTurn(int turn)
	{
		int guess = getGuess(turn);
		boolean isValid = validateInput(guess);
		if (!isValid)
		{
			System.out.println("Please guess the number in 1-100");
			return false;
		}
		if (guess == number)
		{
			System.out.println("Congratulations, you guessed a random number");
			return true;
		}
		else
		{
			if (number < guess){
				System.out.println("The correct number is smaller");
			}
			else
			{
				System.out.println("The correct number is higher");
			}
			return false;
		}
	}
	public static int getGuess(int turn)
	{
		Scanner gs = new Scanner( System.in );
		System.out.println("Turn " + turn + ": Enter a num from 1-100 you, twat");
		return gs.nextInt();
		
	}
	public static boolean validateInput(int myGuess)
	{
		if ((myGuess < 1) || (myGuess > 100))
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public static void main(String[] args) {
		number = generateNumber();
		printRules();
		if (playTurn(1)) return;
		if (playTurn(2)) return;
		if (playTurn(3)) return;
		if (playTurn(4)) return;
		if (playTurn(5)) return;
		if (playTurn(6)) return;
		if (playTurn(7)) return;
		if (playTurn(8)) return;
		if (playTurn(9)) return;
		if (!playTurn(10))
		{
			System.out.println("You loose!! HA HA HA!!");
		}
		
	} 
}
