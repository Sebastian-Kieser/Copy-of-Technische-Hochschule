package Semester1;

import java.util.Scanner;

public class PI_Praktikum2_Task3 {
    public static void main(String[] args) {
        // PI Praktikum 2 Task 3:
        // Solution by Robin Meier & Sebastian Kieser
        Scanner sc = new Scanner(System.in);
        boolean validInput;
        int n = 0;

        do {
            System.out.println("Bitte gib eine Zahl ein, die größer ist als 3:");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                validInput = true;
                System.out.println("Die Eingabe ist gültig.");
            } else {
                System.out.println("Eingabe ist ungültig. Bitte gib eine Zahl ein, die größer ist als 3.");
                validInput = false;
                sc.next();
            }
        } while (!validInput);

        do {
            if (n <= 3) {
                System.out.println("Die Zahl muss größer als 3 sein. Versuche es erneut:");
                n = sc.nextInt();
            }
        } while (n <= 3);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
