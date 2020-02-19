import java.util.Scanner;

public class MovieDriver {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Movie movieObject = new Movie();
		String title;
		String rating;
		int soldTickets;
		String answer;
		do
		{
			System.out.println("Enter the name of a movie: ");
			title = keyboard.nextLine();
			movieObject.setTitle(title);
			System.out.println("Enter the rating of the movie: ");
			rating = keyboard.nextLine();
			movieObject.setRating(rating);
			System.out.println("Enter the number of tickets sold for this movie: ");
			soldTickets = keyboard.nextInt();
			movieObject.setSoldTickets(soldTickets);
			System.out.println(movieObject.toString());
			
			System.out.println("Do you want to enter another? (y or n)");
			answer = keyboard.next();
			keyboard.nextLine();
		}
		while (answer.equalsIgnoreCase("y"));
		System.out.print("\nGoodbye");
		
		
	}

}
