package phase1Project;

import java.util.ArrayList;
import java.util.Scanner;

public class SeatingArrangement {

	static Scanner sc = new Scanner(System.in);
	static int seat, count;
	static ArrayList<String> array = new ArrayList<String>();

	public static void seatCheck(ArrayList list) {
		int m = 0;
		if (list.size() == 0) {
			for (int i = 0; i < 10; i++) {
				list.add(i, 0);

			}
		}
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i)).equals(1)) {
				m++;
			}
		}
		if (m <= 10) {
			System.out.println("Select Seat Number:");
			seat = Integer.parseInt(sc.nextLine());
			if ((list.get(seat - 1)).equals(0)) {
				list.set(seat - 1, 1);
				count++;
			} else {
				System.out.println("Seat is already Booked");
				System.out.println("Please select any other seat");
				seatCheck(list);
			}
		} else {
			System.out.println("Oops! Seat is full");
		}
	}

	public static void money(int totalamount) {
		int money = sc.nextInt();
		if (totalamount == money) {
			System.out.println("🎉🎉🎉Your tickets are booked successfully of seat no. " + array + " at " + Main.date
					+ " from " + Main.time + ".");
			System.out.println("Thank-You!" + "\n");
			System.out.println("Go back to main menu.");

		} else {
			System.out.println("Please enter the correct amount!");
			money(totalamount);
		}

		Main.MainMenu();
	}

	public static void seatingArrangement() {

		String choice = "y";

		ArrayList<Integer> l1 = new ArrayList<Integer>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		ArrayList<Integer> l3 = new ArrayList<Integer>();
		ArrayList<Integer> l4 = new ArrayList<Integer>();
		ArrayList<Integer> l5 = new ArrayList<Integer>();

		while (choice.equalsIgnoreCase("y")) {
			System.out.println("           [...Screen...]        ");
			System.out.println("A-A1 A2 A3 A4 A5     A6 A7 A8 A9 A10-A");
			System.out.println("B-B1 B2 B3 B4 B5     B6 B7 B8 B9 B10-B");
			System.out.println("C-C1 C2 C3 C4 C5     C6 C7 C8 C9 C10-C");
			System.out.println("D-D1 D2 D3 D4 D5     D6 D7 D8 D9 D10-D");
			System.out.println("E-E1 E2 E3 E4 E5     E6 E7 E8 E9 E10-E" + "\n");
			System.out.println("**********Select row from A-E**********");
			System.out.println();
			String row_no = sc.nextLine();

			if (row_no.equalsIgnoreCase("A")) {
				seatCheck(l1);
			} else if (row_no.equalsIgnoreCase("B")) {
				seatCheck(l2);
			} else if (row_no.equalsIgnoreCase("C")) {
				seatCheck(l3);
			} else if (row_no.equalsIgnoreCase("D")) {
				seatCheck(l4);
			} else if (row_no.equalsIgnoreCase("E")) {
				seatCheck(l5);
			} else {
				System.out.println("Enter correct row number!" + "\n" + "Select row from A-E.");

			}
			String seat_no = row_no.toUpperCase().concat(Integer.toString(seat));
			array.add(seat_no);

			System.out.println("Congrats!!" + "Tickets are booked");
			System.out.println("Your seat number is: " + array + "\n");
			System.out.println("Do you want to book another seat?" + "\n" + "Type 'Y' for yes and 'N' for no");
			choice = sc.nextLine();
		}
		System.out.println();
		System.out.println("Cost per ticket is 250Rs.");
		int totalamount = count * 250;
		System.out.println("You booked " + count + " tickets." + "Total amount to be paid is " + totalamount);
		System.out.println("Pay: ");

		money(totalamount);
	}

}
