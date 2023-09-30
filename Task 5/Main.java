import java.util.ArrayList;

// Create client class
public class Main {
	
	// Create main method
	public static void main(String[] args)
	{

		// Create new arraylist and add values from GameMenu
		ArrayList<String> actionsMenu = new ArrayList<String>();
		actionsMenu.add("Start Game");
		actionsMenu.add("Resume Game");
		actionsMenu.add("Pause Game");
		actionsMenu.add("End Game");

		// Test actionsMenu arraylist. Print "start game"
		System.out.println(actionsMenu.get(1));

		// Instantiate GameMenu class with actionsMenu as an argument
		GameMenu GameMenu1 = new GameMenu(actionsMenu);
	
		// Test displayMenu method on a GameMenu instance to print out all menu options
		GameMenu1.displayMenu();

		// Create a variable to save the return value of the user response 
		String userChoice = GameMenu1.getAction();

		// Call the getAction method on on the GameMenu instance, saving the return value
		GameMenu1.getAction();

		// Convert userChoice variable to an int to use it as an argument when calling the doAction method
		int choice = Integer.parseInt(userChoice);
		doAction(choice);
	}
		
		// Create a method to print out the action chosen 
		public static void doAction(int actions)
		{
			switch (actions) 
			{
			case 1: System.out.println("Starting the game now");
				break;
			case 2: System.out.println("Fetching previously saved game data");
				break;
			case 3: System.out.println("Game paused");
				break;
			case 4: System.out.println("Ending game");
			default:
			}

		}





	

}
