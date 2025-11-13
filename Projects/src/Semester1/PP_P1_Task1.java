package Semester1;

import java.util.Scanner;

public class PP_P1_Task1 {
    public static void main(String[] args) {
        // Task5: Concatenation of two words
        // Solution by Sebastian Kieser ( 11407472 )

        Scanner scanner = new Scanner(System.in);

        String s1 = getValidWord(scanner, "Gib eine Eingabe für Wort1 ein.");
        String s2 = getValidWord(scanner, "Gib eine Eingabe für Wort2 ein.");

        String s3 = s1 + " " + s2;

        System.out.println("Die Eingabe für s1 ist: " + s1);
        System.out.println("Die Eingabe für s2 ist: " + s2);
        System.out.println("Der kombinierte String ist: " + s3);

        scanner.close();
    }

    private static String getValidWord(Scanner scanner, String prompt) {
        String word;
        while (true) {
            System.out.println(prompt);
            word = scanner.next();
            if (word.matches("[a-zA-Z]+")) {
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte gib ein Wort mit nur Buchstaben ein.");
            }
        }
        return word;
    }
}