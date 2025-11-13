package Semester1;

import java.util.Scanner;

public class PP_P1_Task2_HashValue {
    public static void main(String[] args) {
        //Task2: Calculation of the "Hash-value"
        //Solution by Sebastian Kieser ( 11407472 )
        Scanner scanner = new Scanner(System.in);

        char c1 = getValidCharInput(scanner, "Gib eine Eingabe für c1 ein.");
        char c2 = getValidCharInput(scanner, "Gib eine Eingabe für c2 ein.");
        char c3 = getValidCharInput(scanner, "Gib eine Eingabe für c3 ein.");
        char c4 = getValidCharInput(scanner, "Gib eine Eingabe für c4 ein.");

        int m = 100;

        System.out.println("Die Eingabe für c1 ist: " + c1);
        System.out.println("Die Eingabe für c2 ist: " + c2);
        System.out.println("Die Eingabe für c3 ist: " + c3);
        System.out.println("Die Eingabe für c4 ist: " + c4);

        int hashValue = (c1 + c2 + c3 + c4) % m;
        System.out.println("Der berechnete Hashwert ist: " + hashValue);
    }

    private static char getValidCharInput(Scanner scanner, String prompt) {
        int asciiValueA = 65;
        int asciiValueZ = 90;
        int asciiValuea = 97;
        int asciiValuez = 122;

        char inputChar;
        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                inputChar = input.charAt(0);
                int asciiValue = (int) inputChar;
                if ((asciiValue >= asciiValueA && asciiValue <= asciiValueZ) || (asciiValue >= asciiValuea && asciiValue <= asciiValuez)) {
                    break;
                }
            }
            System.out.println("Ungültige Eingabe. Bitte gib einen einzelnen Buchstaben ein.");
        }
        return inputChar;
    }
}