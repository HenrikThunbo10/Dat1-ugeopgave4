import java.util.ArrayList;
import java.util.Scanner;

// Create entity class
public class GameMenu
{	
	// Instance variable of type arraylist
	private ArrayList<String> actions;

	// Constructor with arraylist as parameter so an GameMenu object can instantiate a list of actions
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

	// Create a method that prints a message and then the elements from the game menu
	public String getAction()
	{
		System.out.println("Type a number to choose an action");
		
		for(String s : actions)
		{
			System.out.println(s);
		}

		
		// Create scanner object and declare variable choice 
		Scanner scanner = new Scanner(System.in);
		// Let the variable return the users choice
		String choice = scanner.nextLine();
		return choice;
	}

	

}