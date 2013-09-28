
public class LetsPlayCards {
	public static void main(String[] args)
	{
		Welcome w = new Welcome();
		w.WelcomScreen();
		
		Deck d = new Deck();
		Card[] c = {};
		d.ChooseDeckOption(c);
		w.GoodBye();
	}
}
