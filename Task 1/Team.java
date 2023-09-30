public class Team
{
	
	private String teamName;
	private String teamRank;
	private String playerNames;

	// Create a constructor as a template for objects
	public Team(String teamName)
	{
		this.teamName = teamName;


	}

	// Create setTeamRank method to set team rank arguments
	public void setTeamRank(String teamRank)
	{

		this.teamRank = teamRank;
	}

	// Add toString method to print object arguments
	public String toString(){

		return "Hold: " + teamName + ", rang: " + teamRank;
	}

}