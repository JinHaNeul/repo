package Assignment1;

/*
 * Class: CMSC203
 * Instructor: Khandan Monshi
 * Description: This is an ESP game where players guess randomly selected colors from a file, track their score, and save results to a text file.
 * Due: 02/11/2025
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming assignment 
 * independently. I have not copied the code from a student or
 * any source. I have not given my code to any student.
 * Print your Name here: Jin Ha Neul
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;
import java.io.PrintWriter;

public class ESPGame {
	public static void main(String[] args)
	{
		try {
			System.out.println("CMSC203 Assignment1: Test your ESP skills!");
			System.out.println("Welcome to ESP - extrasensory perception!");
			Scanner input = new Scanner(System.in);
			boolean retry = false;
			int Score;
			do {
				boolean flag = false;
				int maxLimit = -1;
				Score = 0;
				System.out.println("Would you please choose one of the 4 options from the menu:");
				System.out.println("");
				do {
					System.out.println("1. read and display on the screen the first 16 names of colors from a file colors.txt, so the player can select one of them names of colors.");
					System.out.println("2. read and display on the screen the first 10 names of colors from a file colors.txt, so the player can select one of them names of colors.");
					System.out.println("3. read and display on the screen the first 5 names of colors from a file colors.txt, so the player can select one of them names of colors.");
					System.out.println("4. Exit form a program");
					System.out.print("Enter the option: ");
					int choice = input.nextInt();
					input.nextLine();
					switch (choice) {
		            case 1:
		            	maxLimit = 16;
		    			flag = true;
		                break;
		            case 2:
		            	maxLimit = 10;
		    			flag = true;
		                break;
		            case 3:
		            	maxLimit = 5;
		    			flag = true;
		                break;
		            case 4:
		            	retry = false;
		            	flag = true;
		            	break;
		            default:
		                flag = false;
		                break;
					}
				} while (!flag);
				if (maxLimit != -1) {
					System.out.print("Enter the filename: ");
					String fileName = input.nextLine();
					if (maxLimit == 16) {
						System.out.println("There are sixteen colors from a file:");
					} else if (maxLimit == 10) {
						System.out.println("There are ten colors from a file:");
					} else if (maxLimit == 5) {
						System.out.println("There are five colors from a file:");
					}
					File file = new File(fileName);
					Scanner fileScanner = new Scanner(file);
					for (int i = 1; i <= maxLimit; i++) {
		        		System.out.println(i + " " + fileScanner.nextLine());
					}
					fileScanner.close();
					Random random = new Random();
					String randomColor = "";
					for (int i = 1; i <= 3; i++) {
						Scanner randomAnswer = new Scanner(file);
						int randomNum = 1 + random.nextInt(maxLimit);
						System.out.println("");
						System.out.println("Round " + i);
						System.out.println("");
						System.out.println("I am thinking of a color.");
						System.out.println("Is it one of list of colors above?");
						System.out.println("Enter your guess: ");
						for (int j = 1; j <= randomNum; j++) {
							randomColor = randomAnswer.nextLine();
						}
						String userGuess = input.nextLine().toLowerCase();
						if (userGuess.compareTo(randomColor) == 0) {
							Score += 1;
						}
						randomAnswer.close();
						System.out.println("");
						System.out.println("I was thinking of " + randomColor + ".");
					}
					System.out.println("Game Over");
					System.out.println("");
					System.out.println("You guessed " + Score + " out of 3 colors correctly.");
					System.out.println("");
					System.out.println("Would you like to continue a Game? Type Yes/No");
					retry = input.nextLine().equalsIgnoreCase("Yes");
				}
			} while (retry);
			String user;
            String description;
            String dueDate;
            System.out.println("");
            System.out.print("Enter your name: ");
            user = input.nextLine();
            System.out.print("Describe yourself: ");
            description = input.nextLine();
            System.out.print("Due Date: ");
            dueDate = input.nextLine();
            System.out.println("Username: " + user);
            System.out.println("User Description: " + description);
            System.out.println("Date: " + dueDate);
            PrintWriter writer = new PrintWriter("EspGameResults.txt");
            writer.println("Game Over");
            writer.println("You guessed " + Score + " out of 3 colors correctly.");
            writer.println("Due Date: " + dueDate);
            writer.println("Username: " + user);
            writer.println("User Description: " + description);
            writer.println("Date: " + dueDate);
            writer.close();
            input.close();
		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
		}
	}
}