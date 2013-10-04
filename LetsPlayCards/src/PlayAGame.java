
public class PlayAGame extends Shared {
	//Variable Definitions
	private String M0 = "Select a game to play!";		// Menu Zero (Title)
	private String M1 = "(B)lack Jack";					// Menu One
	private String M2 = "Draw (P)oker";					// Menu Two
	private String M3 = "(E)xit";						// Menu Three
	private String ML = "(L)ogout";						// Menu Login
	private String[] MV = {M0, M1, M2, M3, ML}; 		// Menu Variables
	static final char CV[] = {'B', 'P', 'E', 'L'}; 		// Char Variables
	
	//Constructor Definitions
	public PlayAGame()
	{
		this.dispMenu(MV);
	}
	
	//Function (Method) Definitions

}
