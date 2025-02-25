import java.util.Scanner;
public class MovieDriver_Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Movie movie1 = new Movie();
		System.out.println("Enter the name of the movie: ");
		movie1.setTitle(input.nextLine());
		System.out.println("Enter the movie's rating: ");
		movie1.setRating(input.nextLine());
		System.out.println("Enter the number of tickets sold: ");
		movie1.setSoldTickets(input.nextInt());
		input.nextLine();
		System.out.println(movie1.toString());
		input.close();
		System.out.println("Goodbye");
	}

}