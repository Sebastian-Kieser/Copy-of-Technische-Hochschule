package Semester1;

import java.util.Arrays;
import java.util.Scanner;

public class PP_Praktikum3_Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Frage nach der Größe des Arrays
        int arraySize = 0;
        while (true) {
            System.out.print("Wie viele Wörter sollen eingelesen werden (mindestens 6)? ");
            if (scanner.hasNextInt()) {
                arraySize = scanner.nextInt();
                scanner.nextLine(); // Puffer leeren
                if (arraySize >= 6) {
                    break;
                } else {
                    System.out.println("Bitte geben Sie eine Zahl größer oder gleich 6 ein.");
                }
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                scanner.nextLine(); // Ungültige Eingabe verwerfen
            }
        }

        // String-Array erstellen und Wörter einlesen
        String[] words = new String[arraySize];
        System.out.println("Bitte geben Sie die Wörter ein:");
        for (int i = 0; i < arraySize; i++) {
            while (true) {
                System.out.print("Wort " + (i + 1) + ": ");
                String input = scanner.nextLine().trim();
                if (!input.isEmpty()) {
                    words[i] = input;
                    break;
                } else {
                    System.out.println("Eingabe darf nicht leer sein. Bitte geben Sie ein gültiges Wort ein.");
                }
            }
        }

        // Array sortieren
        Arrays.sort(words);
        System.out.println("Sortierte Wörter: " + Arrays.toString(words));

        // Suche starten
        boolean weitereSuche = true;
        while (weitereSuche) {
            System.out.print("Nach welchem Wort soll gesucht werden? ");
            String searchWord = scanner.nextLine().trim();

            // Binäre Suche
            int position = binarySearch(words, searchWord);

            if (position >= 0) {
                System.out.println("Das Wort \"" + searchWord + "\" wurde an Position " + position + " gefunden.");
            } else {
                System.out.println("Das Wort \"" + searchWord + "\" wurde nicht gefunden.");
            }

            // Frage, ob eine weitere Suche gewünscht wird
            while (true) {
                System.out.print("Möchten Sie ein weiteres Wort suchen? (ja/nein): ");
                String antwort = scanner.nextLine().trim().toLowerCase();
                if (antwort.equals("ja")) {
                    weitereSuche = true;
                    break;
                } else if (antwort.equals("nein")) {
                    weitereSuche = false;
                    break;
                } else {
                    System.out.println("Ungültige Eingabe. Bitte antworten Sie mit 'ja' oder 'nein'.");
                }
            }
        }

        System.out.println("Programm beendet. Auf Wiedersehen!");
        scanner.close();
    }

    // Binäre Suche implementieren
    private static int binarySearch(String[] array, String key) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            int comparison = key.compareTo(array[middle]);

            if (comparison == 0) {
                return middle; // Schlüssel gefunden
            } else if (comparison < 0) {
                right = middle - 1; // Suche in der linken Hälfte
            } else {
                left = middle + 1; // Suche in der rechten Hälfte
            }
        }

        return -1; // Schlüssel nicht gefunden
    }
}
