package Semester1;

import java.util.Scanner;

public class ÜbungsAufgaben_Algorythmen_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Wie viele Zahlen soll das Array haben?");
        int[] numbers = new int[scanner.nextInt()];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Gib eine Zahl für das Array ein.");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Die Eingabe für das Array an der Stelle " + i + " ist: " + numbers[i]);
        }

        int highestNumber = numbers[0];
        for (int number : numbers) {
            if (number > highestNumber) {
                highestNumber = number;
            }
        }

        System.out.println("Die höchste Zahl im Array ist: " + highestNumber);
        scanner.close();
    }
}