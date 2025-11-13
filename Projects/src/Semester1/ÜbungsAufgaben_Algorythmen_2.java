package Semester1;

import java.util.Scanner;

public class ÜbungsAufgaben_Algorythmen_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib an, wie viele Zahlen du im Array haben willst: ");
        int[] numbers = new int[scanner.nextInt()];

        System.out.println("Gib die Zahlen für das Array ein.");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            System.out.println("Die Zahl an Stelle " + i + " ist " + numbers[i]);
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Die Summe aller Zahlen im Array ist: " + sum);

        double average = (double) sum / numbers.length;
        System.out.println("Der Durchschnitt aller Zahlen im Array ist: " + average);

        scanner.close();
    }
}