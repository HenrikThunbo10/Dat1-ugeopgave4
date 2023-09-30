public class Main {
	
	public static void main (String[] args){
		
		// Create an instance of the team class
		Team Team1 = new Team("Kongerne", "1st", "Henrik, Mikkel, Jeppe");
		// Call setTeamRank method
		Team1.setTeamRank("2nd");

		// Create several instances 
		Team Team2 = new Team("Drengene", "2st", "Players");
		Team2.setTeamRank("3rd");

		Team Team3 = new Team("Rockerne", "1st", ", Præsi, Baune, Glen");
		Team3.setTeamRank("1st");

		Team Team4 = new Team("Olsen Banden", "4th", "Egon, Bennym Kjeld");
		Team4.setTeamRank("5th");

		Team Team5 = new Team("Pizzamændene", "5th", "Adel, Adnan, Ali");
		Team5.setTeamRank("4th");

		// Use toString methods
		System.out.println(Team1.toString());
		System.out.println(Team2.toString());
		System.out.println(Team3.toString());
		System.out.println(Team4.toString());
		System.out.println(Team5.toString());
	}


}