import java.util.Scanner;


public class Welcome {
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
		System.out.println("Chose one...");
	}
	public void ChooseMenuOption()
	{
		boolean done = false;
		Scanner s  = new Scanner(System.in);
		while(!done)
		{
			//switch to choose an option
			//implement Scanner class to get input
			
			this.WelcomScreen();
			char input = s.next().charAt(0);
			switch(input){
			case '1':
				System.out.println("Thanks for choosing Deck!");
				Deck d = new Deck();
				Card[] c = {};
				d.ChooseDeckOption(c);
				break;
			case '2':
				break;
			case '3':
				break;
			case '4':
				break;
			case '5':
				done = true;
				break;
			default:
				System.out.println("Invalid input! Try again...: " + input);
				break;
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
