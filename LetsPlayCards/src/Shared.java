
public class Shared {
	//Variable Definitions
	
	
	
	//Constructor Definitions
	
	
	
	//Function (Method) Definitions
	public void dispMenu(String[] s)
	{
		String VirtBar = "|";
		
		for(int i=0; i<s.length; i++)
		{
			for(; s[i].length()<s[0].length();) // loop through all menu items
			{
				s[i] += " "; // Append spaces to align end characters in menu.
			}
			System.out.println(VirtBar + s[i] +  VirtBar);
		}
	}
}
