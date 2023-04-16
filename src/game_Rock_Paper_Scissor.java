import java.util.Random;
import java.util.Scanner;

public class game_Rock_Paper_Scissor {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		// This is the Rock paper Scissor game
		
		int yourChoice;
		int compChoice;
		int compWon=0;
		int youWon=0;
		int game = 1;
		
		
		System.out.println("\nRules ::\n1. In 0 & 1 :: 1 will win");
		System.out.println("2. In 0 & 2 :: 0 will win");
		System.out.println("3. In 1 & 2 :: 2 will win");
		System.out.println("When Both are same Choices then Game Tie\n");

		System.out.println("0 for Rock");
		System.out.println("1 for Paper");
		System.out.println("2 for Scissor");
		
		
		
		for(game=0; game<5; game++) {
			
			System.out.println("\nEnter Your Choice");
			yourChoice = scan.nextInt();
			System.out.println("Your Choice :: "+yourChoice);
			
			Random random = new Random();
			compChoice = random.nextInt(3); // this will choose value in between 0 to 2
			System.out.println("Computer Choice :: "+compChoice);
			
		
			switch(yourChoice) {
			
			case 0 :
				System.out.println("You Choose Rock ");
				break;
			case 1 :
				System.out.println("You Choose Paper ");
				break;
			case 2 :
				System.out.println("You Choose Scissor ");
				break;
			default:
				System.out.println("You chosen Invalid Number");
				
			
			}
			
			switch(compChoice) {
			
			case 0 :
				System.out.println("Computer Chosen Rock ");
				break;
			case 1 :
				System.out.println("Computer Chosen Paper ");
				break;
			case 2 :
				System.out.println("Computer Chosen Scissor ");
				break;
			default:
				System.out.println("Invalid Number");
				
			
			}
			
			if(compChoice == yourChoice) {
				System.out.println("Match Tie!!!");
			}
			else if(compChoice==0 && yourChoice==1) {
				System.out.println("You Won!!!");
				youWon++;
			}
			else if(compChoice==0 && yourChoice==2) {
				System.out.println("Computer Won!!!");
				compWon++;
			}
			else if(compChoice==1 && yourChoice==0) {
				System.out.println("Computer Won!!!");
				compWon++;
			}
			else if(compChoice==1 && yourChoice==2) {
				System.out.println("You Won!!!");
				youWon++;
			}
			else if(compChoice==2 && yourChoice==0) {
				System.out.println("You Won!!!");
				youWon++;
			}
			else if(compChoice==2 && yourChoice==1) {
				System.out.println("Computer Won!!!");
				compWon++;
			}
		}
		System.out.println("--------------------------------------------");
		if(compWon == youWon) {
			System.out.println("Match Tie!!!");
		}
		else if(compWon > youWon) {
			System.out.println("Computer Won the Game!!!");
			System.out.println("Computer won "+compWon+" times");
		}
		else {
			System.out.println("You Won the Game!!!");
			System.out.println("You won "+youWon+" times");
		}	

	}

}
