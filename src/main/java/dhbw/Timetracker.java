package dhbw;

import java.util.Scanner;

public class Timetracker {

    public static void main(String[] args) {
        System.out.println("Haben Sie bereits ein Konto? (j/n)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if(input.equalsIgnoreCase("j") ) {
            // TODO do login
        } else if (input.equalsIgnoreCase("n")) {
            // TODO register
        } else {
            System.out.println("Falsche Eingabe.");
        }

        System.out.println("Input: " + input);
    }
}
