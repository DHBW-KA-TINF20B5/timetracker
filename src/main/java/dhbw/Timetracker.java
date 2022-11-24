package dhbw;

import java.util.Scanner;

public class Timetracker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("Haben Sie bereits ein Konto? (j/n)");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("j")) {
                // TODO do login
                running = false;
            } else if (input.equalsIgnoreCase("n")) {

                System.out.println("Benutzername?");
                String username = scanner.nextLine();

                System.out.println("Passwort?");
                String password = scanner.nextLine();

                System.out.println("User " + username + "  | password: " + password);

            } else {
                System.out.println("Falsche Eingabe.");
            }

            System.out.println("Input: " + input);
        }
    }
}
