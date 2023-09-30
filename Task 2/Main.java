import java.util.Scanner;

public class Main
{

	public static void main (String[] args)
	{

		// Start out by printing:
		System.out.println("Please type your name.");
		// Import scanner function
		Scanner scanner = new Scanner(System.in);
		
		// Type response and run next line of code as a result
		String name = scanner.nextLine();
		System.out.println("Hi " + name + ". Please type your age.");

		String age = scanner.nextLine();
		// Age typed as a number is problematic in instances like this, so typecasting helps
		int i = Integer.parseInt(age);

		System.out.println("Så du er " + age);

		// Create a variable and assign the number of years left before retirement
		int retire = 67 - i;

		if (i > 67 || 0 > i)
		{
			System.out.println("Invalid age");
		}
			else

			System.out.println("Du går på pension om " + retire + "år");



	}
}