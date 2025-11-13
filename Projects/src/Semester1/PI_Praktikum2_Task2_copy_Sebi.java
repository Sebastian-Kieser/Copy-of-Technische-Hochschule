package Semester1;

import java.util.Scanner;

public class PI_Praktikum2_Task2_copy_Sebi {
    public static void main(String[] args) {
        // PI Praktikum 2 Task 2:
        // Solution by Robin Meier & Sebastian Kieser
        // Teamnummer: 3
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib einen Wert für a an:");
        int a;
        a = controlDataType(sc);
        System.out.println("Der Wert für a ist: " + a);

        System.out.println("Gib einen Wert für b an:");
        int b;
        b = controlDataType(sc);
        System.out.println("Der Wert für b ist: " + b);

        int sum = 0;
        while (a % 2 == 0 || b % 2 != 0) {
            if (a == b) {
                System.out.println("Beide Zahlen sind gleich, gib neue ein.");
                System.out.println("Gib einen neuen Wert für a ein:");
                a = controlDataType(sc);
                System.out.println("Der neue Wert für a ist: " + a);
                System.out.println("Gib einen neuen Wert für b ein:");
                b = controlDataType(sc);
                System.out.println("Der neue Wert für b ist: " + b);
            }
            for (int i = a; i <= b; i += 2) {
                sum += i;
                System.out.println("Die Abfolge der Zahlen bis zum Endwert b ist: " + i);
                System.out.println("Die Abfolge der Zwischenergebnisse ist: " + sum);
            }
            if (sum != 0) {
                System.out.println("Das Endergebnis ist: " + sum);
                break;
            }
        }
        }

    private static int controlDataType(Scanner sc) {
        while (true) {
            System.out.print("Bitte gib eine Zahl ein: ");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Ungültige Eingabe. Bitte gib eine ganze Zahl ein.");
                sc.next(); // Ungültigen Input verwerfen
            }
        }
    }
}
