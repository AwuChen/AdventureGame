import java.util.Scanner;
import java.awt.Toolkit;
public class day2 {

	public static void main(String[] args) {
		int y = 0;
		int x = 0;
		int z = 0;
		int a = 0;
		int c = 0;
		do
		{ 
		Scanner scan = new Scanner (System.in);
		System.out.print("LOGIN:");
		String name = scan.nextLine();
		System.out.println ("Hello " + name);
		if (name.equalsIgnoreCase("Leucosia")){
			System.out.println("IDENTIFICATION RECOGNIZED--CONNECTION RESUMED.");
			//make a beep sound
			Toolkit tk = Toolkit.getDefaultToolkit();
			tk.beep();
			x = 4; 
		}else{
			System.out.println("IDENTIFICATION NOT RECOGNIZED--CONNECTION TERMINATED.");
			x = 5; 
		}
		} while (x==5);
			System.out.println("Welcome to Adventure!!" );
		
		System.out.println("you are infront of a giant castle, the gate is locked");
		
		do
		{
		System.out.println("would you like to open up the gate y/n");
		Scanner scan = new Scanner (System.in);
		String enter = scan.nextLine();
		if (enter.equalsIgnoreCase("y")){
			System.out.println("you need a silver key to open the gate");
			//make a beep sound
			Toolkit tk = Toolkit.getDefaultToolkit();
			tk.beep();
			y = 1;
		}else{
			System.out.println("you failed to open the gate");
			y = 2;
		}
		}while (y == 2);
		
		do
		{
		System.out.println("Inorder to obtain the silver key, you need to pass a test");
		System.out.println("would you like to take the test? y/n");
		Scanner scan = new Scanner (System.in);
		String question = scan.nextLine();
		if (question.equalsIgnoreCase("y")){
			
			System.out.println("Which animal has the largest brain?");
			System.out.println("A:Dolphin");
			System.out.println("B:Sperm Whale");
			System.out.println("C:Elephant");
			System.out.println("D:Dinosaur");
			
			
			z = 1;
		}else{
			System.out.println("don't be a coward... take the test...");
			z = 2;
		}
		}while (z == 2);
		if (z == 2);
			Scanner scan = new Scanner (System.in);
			String trivia = scan.nextLine();
		if (trivia.equalsIgnoreCase("B")){
				System.out.println("You are correct, The sperm whale has the largest brain weighing around 17 pounds.");
				System.out.println("congradulations you have obtained the silver key!!");
				
				a = 1;
			}else{
				System.out.println("you are wrong guess again");
				a = 2;
				
			
		do
		{
		System.out.println("A:Dolphin");
		System.out.println("B:Sperm Whale");
		System.out.println("C:Elephant");
		System.out.println("D:Dinosaur");
		Scanner scanner = new Scanner (System.in);
		String trivia2 = scan.nextLine();
	if (trivia2.equalsIgnoreCase("B")){
			System.out.println("You are correct, The sperm whale has the largest brain weighing around 17 pounds.");
									
			c = 1;
		}else{
			System.out.println("you are wrong again...");
			c = 2;
		}
		}while(c == 2);
	
	if (c == 1)
		System.out.println("congradulations!! you have obtained the silver key");
			}
	}
}


	
