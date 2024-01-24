package LoginSystem;

import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        // Hard-coded username and password for demonstration purposes
        String correctUsername = "admin";
        String correctPassword = "password123";

        // Create a Scanner to read user input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Login System");
        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Check if the entered username and password match the correct ones
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome, " + username);
        } else {
            System.out.println("Login failed. Please check your credentials.");
        }

        // Close the scanner
        scanner.close();
    }
}
