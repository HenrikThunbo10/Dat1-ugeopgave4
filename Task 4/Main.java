import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args)
	{

		// Create arraylist and add values to actions arraylist from from GameMenu
		ArrayList<String> actionsMenu = new ArrayList<String>();
		actionsMenu.add("Start Game");
		actionsMenu.add("Resume Game");
		actionsMenu.add("Pause Game");
		actionsMenu.add("End Game");

		System.out.println(actionsMenu.get(1));

		GameMenu GameMenu1 = new GameMenu(actionsMenu);
	
		GameMenu1.displayMenu();

	}

}
