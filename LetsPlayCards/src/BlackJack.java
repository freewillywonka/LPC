
public class BlackJack extends Shared {
	//Variable Definitions
	private String M0 = "Let's Play Black Jack!";		// Menu Zero (Title)
	private String M1 = "How many (p)layers?";			// Menu One
	private String M2 = "How many (d)ecks?";			// Menu Two
	private String M3 = "(E)xit";						// Menu Three
	private String ML = "(L)ogout";						// Menu Login
	private String[] MV = {M0, M1, M2, M3, ML}; 		// Menu Variables
	static final char CV[] = {'B', 'P', 'E', 'L'}; 		// Char Variables
	
	//Constructor Definitions
	public BlackJack()
	{
		this.dispMenu(MV);
	}

	//Function (Method) Definitions
}
