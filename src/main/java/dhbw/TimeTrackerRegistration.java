package dhbw;

import java.util.Scanner;

public class TimeTrackerRegistration {
    private final Scanner scanner = new Scanner(System.in);


    void registrationProcess() {
        System.out.println("Benutzername?");
        String username = scanner.nextLine();

        System.out.println("Passwort?");
        String password = scanner.nextLine();

        System.out.println("User " + username + "  | password: " + password);
    }
}
