import java.util.Random;
import java.util.Scanner;

public class ScissorPaperStone {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		int compChoice; 
		String request;
		int userChoice;

		do {
			compChoice = rand.nextInt(3);
			System.out.print("Please enter your choice: 0 = scissors; 1 = paper; 2 = stone:>> ");
			userChoice = scan.nextInt(3);

			if (compChoice == userChoice) {
				System.out.println("It's a draw");
			}
			else if (compChoice == 0 && userChoice == 1) {
				System.out.println("Computer wins, " + compChoice + " beats " + userChoice);
			}
			else if (compChoice == 1 && userChoice == 2) {
				System.out.println("Computer wins, " + compChoice + " beats " + userChoice);
			}
			else if (compChoice == 2 && userChoice == 0) {
				System.out.println("Computer wins, " + compChoice + " beats " + userChoice);
			}
			else {
				System.out.println("User wins " + userChoice + " beats " + compChoice);
			}
			System.out.print("Do you want to play again? Type y/n: ");
			request = scan.next();
		}
		while (!request.equalsIgnoreCase("stop"));
		scan.close();
	}
}

///////// THIS UP SHOULD BE INSIDE THE LOOP, EXCEPT THE DISPLAY PART.

//LOOP(DO WHILE)
//if compchoice = userchoice
// Display "It's a draw"
// else if compchoice=0 AND userchoice =1
//display computer wins
//else if computerchoice=1 AND userchoice=2
//display computer wins
//else if compchoice=2 and userchoice =0
//display computer wins
//else
//display user wins
//display: do you want to play again?Type stop to end
//(loop)until user enter stop

