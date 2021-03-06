import java.io.IOException;
import java.util.Scanner;

public class Deck extends Shared{
	//Variable Declarations
	private String M0 = "Welcome to TheDeck Game!";		// Menu Zero (Title)
	private String M1 = "(P)lay a game";				// Menu One
	private String M2 = "(C)reate a game";				// Menu Two
	private String M3 = "(E)xit";						// Menu Three
	private String ML = "(L)ogin";						// Menu Login
	private String[] MV = {M0, M1, M2, M3, ML}; 		// Menu Variables
	
	public int numOfCards;
	public Card[] deck;
	
	//Constructor Definitions	
	public Deck()
	{
		this.dispMenu(MV);
	}
	
	//Funtion (Method) Definitions
	public void DeckMenu()
	{
		System.out.println("--------- Please select an option!  --------------");
		System.out.println("|                                                |");
		System.out.println("|   1. Shuffle                                   |");
		System.out.println("|                                                |");
		System.out.println("|   2. Draw                                      |");
		System.out.println("|                                                |");
		System.out.println("|   3. Put a card back                           |");
		System.out.println("|                                                |");
		System.out.println("|   4. Search for a card                         |");
		System.out.println("|                                                |");
		System.out.println("|   5. Back                                      |");
		System.out.println("|                                                |");
		System.out.println("|------------------------------------------------|");
		System.out.println("Choose one:");
	}
	public void ChooseDeckOption(Card[] c)
	{
		boolean done = false;
		Scanner s  = new Scanner(System.in);
		while(!done)
		{
			this.DeckMenu();
			char input = s.next().charAt(0);
			switch(input){
			case '1':
//				System.out.println("this is case 1: " + input);
//					this.Shuffle(c);
				break;
			case '2':
//				System.out.println("this is case 2: " + input);
//					this.DrawCard(c);
				break;
			case '3':
//				System.out.println("this is case 3: " + input);
//					this.ReturnCard(c);
				break;
			case '4':
//				System.out.println("this is case 4: " + input);
//					this.SearchCard(c);
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
//		s.close();		
	}
	public Card[] Shuffle(Card[] c)
	{
		return c;
	}
	public Card[] DrawCard(Card[] c)
	{
		return c;
	}
	public Card[] ReturnCard(Card[] c)
	{
		return c;
	}
	public Card[] SearchCard(Card[] c)
	{
		return c;
	}
}
