package Semester1;

import java.util.Scanner;

public class PP_Praktikum2_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0; // Schlüsselwert für die Verschiebung
        boolean validInput = false;

        // Einlesen einer ganzen Zahl n zwischen 1 und 25
        while (!validInput) {
            System.out.println("Gib einen Wert für n ein zwischen 1 und 25:");
            if (sc.hasNextInt()) {
                n = sc.nextInt();
                if (n >= 1 && n <= 25) {
                    validInput = true;
                } else {
                    System.out.println("Ungültige Eingabe. Der Wert muss zwischen 1 und 25 liegen.");
                }
            } else {
                System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben.");
                sc.next(); // Leere Eingabepuffer
            }
        }

        // Einlesen einer Zeichenkette in einen StringBuffer
        System.out.println("Gib eine Zeichenkette ein, die du ver- oder entschlüsseln willst:");
        sc.nextLine(); // Eingabepuffer leeren
        StringBuffer originalPasswort = new StringBuffer(sc.nextLine());

        StringBuffer aktuellerZustand = new StringBuffer(originalPasswort); // Kopie des Originalpassworts

        while (true) {
            System.out.println("Wähle aus:");
            System.out.println("1. Zum Verschlüsseln gib 'encrypt' ein.");
            System.out.println("2. Zum Entschlüsseln gib 'decrypt' ein.");
            System.out.println("3. Zum Beenden gib 'exit' ein.");

            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("encrypt")) {
                StringBuffer verschluesselt = new StringBuffer();

                // Verschlüsseln der Zeichenkette
                for (int i = 0; i < aktuellerZustand.length(); i++) {
                    char zeichen = aktuellerZustand.charAt(i);

                    // Großbuchstaben
                    if (zeichen >= 'A' && zeichen <= 'Z') {
                        char verschluesseltesZeichen = (char) ((zeichen - 'A' + n) % 26 + 'A');
                        verschluesselt.append(verschluesseltesZeichen);
                    }
                    // Kleinbuchstaben
                    else if (zeichen >= 'a' && zeichen <= 'z') {
                        char verschluesseltesZeichen = (char) ((zeichen - 'a' + n) % 26 + 'a');
                        verschluesselt.append(verschluesseltesZeichen);
                    }
                    // Andere Zeichen unverändert anhängen
                    else {
                        verschluesselt.append(zeichen);
                    }
                }

                aktuellerZustand = verschluesselt; // Zustand aktualisieren
                System.out.println("Verschlüsselte Zeichenkette: " + aktuellerZustand.toString());

            } else if (choice.equalsIgnoreCase("decrypt")) {
                StringBuffer entschluesselt = new StringBuffer();

                // Entschlüsseln der Zeichenkette
                for (int i = 0; i < aktuellerZustand.length(); i++) {
                    char zeichen = aktuellerZustand.charAt(i);

                    // Großbuchstaben
                    if (zeichen >= 'A' && zeichen <= 'Z') {
                        char entschluesseltesZeichen = (char) ((zeichen - 'A' - n + 26) % 26 + 'A');
                        entschluesselt.append(entschluesseltesZeichen);
                    }
                    // Kleinbuchstaben
                    else if (zeichen >= 'a' && zeichen <= 'z') {
                        char entschluesseltesZeichen = (char) ((zeichen - 'a' - n + 26) % 26 + 'a');
                        entschluesselt.append(entschluesseltesZeichen);
                    }
                    // Andere Zeichen unverändert anhängen
                    else {
                        entschluesselt.append(zeichen);
                    }
                }

                aktuellerZustand = entschluesselt; // Zustand aktualisieren
                System.out.println("Entschlüsselte Zeichenkette: " + aktuellerZustand.toString());

            } else if (choice.equalsIgnoreCase("exit")) {
                System.out.println("Programm beendet.");
                break;
            } else {
                System.out.println("Ungültige Eingabe. Bitte 'encrypt', 'decrypt' oder 'exit' eingeben.");
            }
        }

        sc.close();
    }
}
