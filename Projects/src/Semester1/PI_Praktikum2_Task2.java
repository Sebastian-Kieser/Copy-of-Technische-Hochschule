package Semester1;

import java.util.Scanner;

public class PI_Praktikum2_Task2 {
    public static void main(String[] args) {
        //PI Praktikum 2 Task 2:
        //Solution by Robin Meier & Sebastian Kieser
        //Teamnummer: 3
        Scanner sc = new Scanner(System.in);

        System.out.println("Gib einen Wert für a an:");
        int a = sc.nextInt();
        System.out.println("Gib einen Wert für b an:");
        int b = sc.nextInt();

        while (a == 0 || b == 0) {
            if (a == 0) {
                System.out.println("Die Eingabe für ist ungültig. Bitte mach eine neue.");
                a = sc.nextInt();
            }
            if (b == 0) {
                System.out.println("Die Eingabe für b ist ungültig, bitte mach eine neue.");
                b = sc.nextInt();
            }
            if (a == b) {
                System.out.println("Die beiden Variablen sind gleich und das geht nicht. Bitte mach eine neue Eingabe für beide.");
                a = sc.nextInt();
                System.out.println("Die Eingabe für a = " + a);
                b = sc.nextInt();
                System.out.println("Die Eingabe für b = " + b);
            }
        }

        while (a % 2 != 0 || b % 2 != 0) {

            System.out.println("Die eingegebenen Zahlen sind nicht gerade. Bitte gib neue Zahlen ein!");
            System.out.println("Gib eine neue Zahl für a ein:");
            a = sc.nextInt();
            System.out.println("Die neue Eingabe für a = " + a);
            System.out.println("Gib eine neue Zahl für b ein:");
            b = sc.nextInt();
            System.out.println("Die neue Eingabe für b = " + b);
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
}