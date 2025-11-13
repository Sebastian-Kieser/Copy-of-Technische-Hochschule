package Semester1;

import java.util.Scanner;

public class PP_P1_Task4_ASCIISymbols {
    public static void main(String[] args) {
        // Task4: Calculation with ASCII-Symbols
        // Solution by Sebastian Kieser ( 11407472 )

        Scanner scanner = new Scanner(System.in);
        char c;

        // Prompt the user until a valid uppercase letter is entered
        while (true) {
            System.out.println("Gib einen Großbuchstaben für c ein.");
            String input = scanner.nextLine();
            if (input.length() == 1 && Character.isUpperCase(input.charAt(0))) {
                c = input.charAt(0);
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte gib einen einzelnen Großbuchstaben ein.");
            }
        }

        // Calculate the letter two positions ahead, wrapping around if necessary
        char result = (char) ((c - 'A' + 2) % 26 + 'A');

        // Output the result
        System.out.println("Der Buchstabe, der zwei Positionen hinter " + c + " steht, ist: " + result);

        scanner.close();
    }
}