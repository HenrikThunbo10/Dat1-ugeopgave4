import java.util.ArrayList;

public class GameMenu
{	
	// Variables
	private ArrayList<String> actions;

	// Constructor
	public GameMenu(ArrayList<String> actions)
	{
		this.actions = actions;	
	}
	
	// Add method diplayMenu to print out actionsMenu attributes
	public void displayMenu()
	{
		for(String s : actions)
		{
			System.out.println(s);
		}
	}

}