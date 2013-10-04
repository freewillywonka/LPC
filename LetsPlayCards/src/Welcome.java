import java.util.Scanner;


public class Welcome extends Shared {
	//Variable Definitions
	private String M0 = "Welcome to TheDeck Game!";		// Menu Zero (Title)
	private String M1 = "(P)lay a game";				// Menu One
	private String M2 = "(C)reate a game";				// Menu Two
	private String M3 = "(E)xit";						// Menu Three
	private String ML = "(L)ogin";						// Menu Login
	private String[] MV = {M0, M1, M2, M3, ML}; 		// Menu Variables
	static final char CV[] = {'P', 'C', 'E', 'L'}; 		// Char Variables
	
	//Constructor Definitions
	public Welcome()
	{
		this.dispMenu(MV);
	}
	
	//Function (Method) Definitions
	public void WelcomScreen()
	{
		System.out.println("--------- Welcome to Let's Play Cards! -----------");
		System.out.println("|                                                |");
		System.out.println("|   1. Deck                                      |");
		System.out.println("|                                                |");
		System.out.println("|   2. Discard                                   |");
		System.out.println("|                                                |");
		System.out.println("|   3. Hand                                      |");
		System.out.println("|                                                |");
		System.out.println("|   4. Field/IP                                  |");
		System.out.println("|                                                |");
		System.out.println("|   5. Trash/OOP                                 |");
		System.out.println("|                                                |");
		System.out.println("|------------------------------------------------|");
	}
	public void ChooseMenuOption()
	{
		boolean done = false;
		Scanner s  = new Scanner(System.in);
		
		System.out.println("Chose one...");
		while(!done)
		{
			//switch to choose an option
			//implement Scanner class to get input
			
			char input = s.next().charAt(0);
			switch(input){
			case '1':
//			case cc[1]: // figure out how to pass in a char array?!?
				System.out.println("Thanks for choosing Deck!");
				Deck d = new Deck();
				Card[] c = {};
				d.ChooseDeckOption(c);
				break;
			case '2':
				break;
			case '3':
				done = true; // Exit the 'while' loop
				break;
			case '4':
				break;
			case '5':
				break;
			default:
				System.out.println("Invalid input! Try again...: " + input);
				break;
			}
			if(!done)
			{
				this.dispMenu(MV);
			}
			
//		System.out.println("Press Any Key To Continue...");
//		s.next().charAt(0);
		
		
		}
		// close the scanner class only when top level memu exits.
		s.close();		
	}
	public void GoodBye()
	{
		System.out.println("--------- Thanks for playing LPC!!!    -----------");
		System.out.println("|                                                |");
		System.out.println("|   we hope you enjoyed playing                  |");
		System.out.println("|                                                |");
		System.out.println("|   special thanks to Travis Comstock            |");
		System.out.println("|                                                |");
		System.out.println("|   and William Hillhouse                        |");
		System.out.println("|                                                |");
		System.out.println("|   for creating this awesome game!              |");
		System.out.println("|                                                |");
		System.out.println("|   peace!!!                                     |");
		System.out.println("|                                                |");
		System.out.println("|------------------------------------------------|");	}
}
