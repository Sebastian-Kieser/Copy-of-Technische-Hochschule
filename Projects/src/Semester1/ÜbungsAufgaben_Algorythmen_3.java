package Semester1;

import java.util.Scanner;

public class ÜbungsAufgaben_Algorythmen_3{
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Gib an, wie viele Elemente in der Menge sein sollen");
    int[] numbers = new int[scanner.nextInt()];

    for (int i = 0; i < numbers.length; i++) {
        numbers[i] = scanner.nextInt();
    }

    for (int i = 0; i < numbers.length; i++) {
        System.out.println("Die Zahl an Stelle " + i + " ist " + numbers[i]);
    }

    for (int i = 0; i < numbers.length; i++) {
        for (int j = i + 1; j < numbers.length; j++) {
            if (numbers[i] == numbers[j]) {
                System.out.println("Die Zahl " + numbers[i] + " ist doppelt vorhanden.");
            }
        }
    }
    scanner.close();
    }
}