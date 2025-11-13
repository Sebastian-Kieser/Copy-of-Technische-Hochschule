package Semester1;

import java.util.Scanner;

public class PI_Praktikum2_Task2_copy2 {
    public static void main(String[] args) {
        //PI Praktikum 2 Task 2:
        //Solution by Robin Meier & Sebastian Kieser
        //Teamnummer: 3
        Scanner sc = new Scanner(System.in);

        System.out.println("Regeln für die Eingabe:");
        System.out.println("1. Die Eingaben dürfen nicht gleich sein.");
        System.out.println("2. Die Eingaben müssen gerade Zahlen sein.");
        System.out.println("3. Die Eingaben dürfen nicht 0 sein.");
        System.out.println("4. Die Eingabe für b muss größer als die Eingabe für a sein.");
        System.out.println("Gib eine gültige Eingabe für a ein");
        int a = getValidIntInput(sc);

        System.out.println("Gib eine gültige Eingabe für b ein");
        int b = getValidIntInput(sc);

        while (b <= a) {
            System.out.println("Die Eingabe für b muss größer sein als die Eingabe für a, bitte gib eine größere Eingabe für b ein.");
            b = getValidIntInput(sc);

        }

        int sum = 0;
        while (a % 2 == 0 || b % 2 != 0) {
            for (int i = a; i <= b; i += 2) {
                sum += i;
                System.out.println("Die Abfolge der Zahlen bis zum Endwert b ist: " + i);
                System.out.println("Die Abfolge der Zwischenergebnisse ist: " + sum);
            }
            System.out.println("Das Endergebnis ist: " + sum);
            break;
        }
    }
    private static int getValidIntInput(Scanner sc){
        int input;

        while (true) {
            System.out.println("Bitte gib eine gültige Ganzzahl ein:");

            if (!sc.hasNextInt()) {
                System.out.println("Die Eingabe ist ungültig, bitte gib eine Ganzzahl ein.");
                sc.next();
                continue;
            }

            input = sc.nextInt();

            if (input == 0) {
                System.out.println("Die Eingabe ist ungültig, bitte gib eine Ganzzahl ungleich 0 ein.");
                continue;
            }

            if (input % 2 != 0) {
                System.out.println("Die Eingabe ist ungültig, bitte gib eine gerade Ganzzahl ein");
                continue;

            }

            if (input <= 0) {
                System.out.println("Die Eingabe ist ungültig, bitte gib eine Ganzzahl größer als 0 ein");
                continue;
            }

            break;
        }

        return input;
    }
}