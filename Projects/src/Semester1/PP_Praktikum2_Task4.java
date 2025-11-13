package Semester1;

import java.util.Scanner;

public class PP_Praktikum2_Task4 {
    public static void main(String[] args) {
        // Task4: Abtastung und Quantisierung von Funktionen

        Scanner sc = new Scanner(System.in);
        while (true) {
            float x = 0;
            boolean validInput = false;
            while (!validInput) {
                System.out.println("Gib einen double Wert für x an mit einem Punkt (2.5 ist hier das Minimum und 4.0 das Maximum).");
                if (sc.hasNextFloat()) {
                    x = sc.nextFloat();
                    if (String.valueOf(x).contains(".")) {
                        validInput = true;
                    } else {
                        System.out.println("Ungültige Eingabe. Bitte eine Zahl mit einem Punkt eingeben.");
                    }
                } else {
                    System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben.");
                    sc.next(); // Clear the invalid input
                }
            }
            System.out.println("Der Wert für x ist: " + x);
            if (x == 2.5) {
                System.out.println("Minimum");
            }
            for (double i = 2.0; i < 4.0; i += 0.1) {
                double function = 20 * (i * i) - 100 * i - 129.5;
                System.out.println(function);
                int ergebnisAbgerundet = (int) Math.round(function * (-1));
                System.out.println(ergebnisAbgerundet);
            }


            System.out.println("Wenn du die Schleife verlassen willst, schreibe exit.");
            sc.nextLine(); // Clear the buffer
            if (sc.hasNext("exit")) {
                System.out.println("Du hast die Schleife verlassen.");
                break;
            }
        }
        sc.close();
    }
}