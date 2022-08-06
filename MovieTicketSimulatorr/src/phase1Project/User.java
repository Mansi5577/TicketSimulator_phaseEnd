package phase1Project;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class User {

	public static final String user = "C:\\userM\\Java\\MovieTicket_project\\files\\user.txt";

	public void authenticate() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter User Name: ");
		String username = sc.nextLine();

		System.out.println("Enter Password: ");
		String password = sc.nextLine();

		Credentials c = new Credentials(username, password);
		Credentials filedata = readFileCredentials(user);

		if (c.validating(filedata) != true) {
			System.out.println("Invalid Username and Password!");
			System.out.println("Please Login Again..");
			authenticate();
		}

	}

	public Credentials readFileCredentials(String user) {
		try {
			FileReader readobj = new FileReader(user);
			Scanner sc = new Scanner(readobj);

			return new Credentials(sc.nextLine(), sc.nextLine());

		} catch (FileNotFoundException e) {
			System.out.println("File not found!");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Give the correct path! File is not able to read");
			e.printStackTrace();
		}
		return null;
	}
}
