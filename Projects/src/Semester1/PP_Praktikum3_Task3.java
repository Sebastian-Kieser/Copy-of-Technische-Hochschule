package Semester1;

import java.util.Scanner;

public class PP_Praktikum3_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Benutzeraufforderung
            System.out.println("Gib einen String ein (nur Buchstaben, oder 'exit' zum Beenden):");
            String passwort = sc.nextLine();

            // Beenden, wenn 'exit' eingegeben wurde
            if (passwort.equalsIgnoreCase("exit")) {
                System.out.println("Du hast das Programm verlassen.");
                break;
            }

            // Eingabeüberprüfung
            if (!istNurBuchstaben(passwort)) {
                System.out.println("Ungültige Eingabe. Der String darf nur Buchstaben enthalten.");
                continue; // Wiederhole die Schleife
            }

            // Berechnung des Hash-Werts
            int hashWert = berechneHash(passwort);
            System.out.println("Der Hash-Wert des Strings ist: " + hashWert);
        }
    }

    // Methode zur Eingabeüberprüfung (nur Buchstaben)
    public static boolean istNurBuchstaben(String input) {
        for (char c : input.toCharArray()) {
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    // Methode zur Berechnung des Hash-Werts
    public static int berechneHash(String input) {
        int summe = 0;
        int m = 100; // Modulo-Wert

        // ASCII-Werte summieren
        for (char c : input.toCharArray()) {
            summe += c; // ASCII-Wert des Zeichens hinzufügen
        }

        // Modulo-Operation
        return summe % m;
    }
}
