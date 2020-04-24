import java.util.Scanner;

public class GenerateRollDice {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		

		char runApp = 'y';
		
		
		
		
		
		while (runApp == 'y') {
			System.out.println("Enter number of sides for dice 1:");

			int side1 = scnr.nextInt();
			System.out.println("Enter number of sides for dice 2:");
			int side2 = scnr.nextInt();

			System.out.println( generateRandomDieRoll(side1));
			System.out.println(generateRandomDieRoll(side2));
					
			int point = generateRandomDieRoll(side1) + generateRandomDieRoll(side2);
			System.out.println("Your point is:" + point);
			if (point == 12 || point == 3 || point == 2) {
				System.out.println("Craps");
			} else if (point == 7 || point == 11) {
				System.out.println("winner");
			}

		}
		System.out.println("Roll Again (y/n)");
		runApp = scnr.next().charAt(0);
	}

	public static int generateRandomDieRoll(int dieRoll) {
		int die1;
		die1 = (int) (Math.random() * dieRoll + 1);
		int die2;
		die2 = (int) (Math.random() * dieRoll + 1);

		return die1;

	}

}
