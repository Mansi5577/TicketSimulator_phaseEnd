package phase1Project;

import java.util.Scanner;

public class Main {

	static String date, movieName, time;

	static Scanner sc = new Scanner(System.in);

	public static void selectingMovie() {
		System.out.println("Select a movie you want to watch!");
		System.out.println("1. RRR");
		System.out.println("2. KGF");
		System.out.println("3. Bahubali");
		System.out.println("4. Doctor Strange");
		System.out.println();
		int ch = sc.nextInt();
		switch (ch) {
		case 1:
			movieName = "RRR";
			break;
		case 2:
			movieName = "KGF";
			break;
		case 3:
			movieName = "Bahubali";
			break;
		case 4:
			movieName = "Doctor Strange";
			break;
		default:
			System.out.println("Please select a movie which is currently playing in the Theater");
			selectingMovie();
			break;
		}
		selectDate();
	}

	public static void selectDate() {
		System.out.println("Enter date for the show:");
		sc.nextLine();
		date = sc.nextLine();
		System.out.println();
		selectTime();
	}

	public static void selectTime() {
		System.out.println("Select time:");
		System.out.println();
		System.out.println("1. 9:00 am to 12:00 pm");
		System.out.println("2. 12:30 pm to 3:00 pm");
		System.out.println("3. 3:00 pm to 6:00 pm");
		System.out.println("4. 7:00 pm to 10:00 pm");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			time = "9:00 am to 12:00 pm";
			break;
		case 2:
			time = "12:30 pm to 3:00 pm";
			break;
		case 3:
			time = "3:00 pm to 6:00 pm";
			break;
		case 4:
			time = "7:00 pm to 10:00 pm";
		default:
			System.out.println("Please select available showtime.");
			selectTime();
			break;
		}

		SeatingArrangement.seatingArrangement();
	}

	public static void Booking() {
		selectingMovie();
	}

	public static void viewBookingStatus() {
		System.out.println("Status: ");
		if (SeatingArrangement.array.isEmpty()) {
			System.out.println("No booked tickets!");
		} else {
			System.out.println("Booked tickets are: " + SeatingArrangement.array + "\n");
		}
		System.out.println("Go back to main menu.");
		MainMenu();
	}

	public static void MainMenu() {
		System.out.println();
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Select any option or Press (0) to exit...");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("1. Book a ticket.");
		System.out.println("2. View Bookings.");
		System.out.println("0. Exit.");

		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			Booking();
			break;
		case 2:
			viewBookingStatus();
			break;
		case 0:
			System.out.println("Exiting the movie ticket simulator...");
			System.exit(0);
			break;
		default:
			System.out.println("Please select a valid option!");
			MainMenu();
			break;
		}
	}

	public static void main(String[] args) {

		System.out.println("\n\n");
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("\t\t\tMovie Ticket Booking Simulator");
		System.out.println("--------------------------------------------------------------------------------");
		User me = new User();
		me.authenticate();
		System.out.println("Successfully logged in..");
		MainMenu();

	}

}
