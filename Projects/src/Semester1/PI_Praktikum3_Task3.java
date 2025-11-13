package Semester1;

import java.util.Arrays;
import java.util.Scanner;

public class PI_Praktikum3_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Menü ausgeben
        printMenu();

        int[] notenArray = null; // Wird von Option 1 initialisiert
        String[] arrayVorgegeben = null; // Wird von Option 4 initialisiert
        boolean running = true;

        while (running) {
            System.out.print("Gib eine Zahl zwischen 0 und 5 ein: ");
            if (sc.hasNextInt()) {
                int menuePunkt = sc.nextInt();

                // Überprüfen, ob die Zahl im gewünschten Bereich liegt
                if (menuePunkt >= 0 && menuePunkt <= 5) {
                    switch (menuePunkt) {
                        case 1:
                            System.out.println("1. Anlegen eines Arrays mit Beispielnoten.");
                            notenArray = legeNotenArrayAn();
                            break;

                        case 2:
                            if (notenArray == null) {
                                System.out.println("Bitte zuerst das Notenarray anlegen (Option 1)!");
                            } else {
                                System.out.println("2. Berechne Durchschnitt.");
                                berechneDurchschnitt(notenArray);
                            }
                            break;

                        case 3:
                            if (notenArray == null) {
                                System.out.println("Bitte zuerst das Notenarray anlegen (Option 1)!");
                            } else {
                                System.out.println("3. Berechne Abweichungen.");
                                double durchschnitt = berechneDurchschnitt(notenArray);
                                berechneAbweichung(notenArray, durchschnitt);
                            }
                            break;

                        case 4:
                            System.out.println("4. Anlegen eines Arrays mit Strings.");
                            arrayVorgegeben = legeStringArrayAn();
                            break;

                        case 5:
                            if (arrayVorgegeben == null) {
                                System.out.println("Bitte zuerst das String-Array anlegen (Option 4)!");
                            } else {
                                System.out.println("5. Umkehren eines String-Arrays.");
                                reverseArray(arrayVorgegeben);
                            }
                            break;

                        case 0:
                            System.out.println("Programm beendet.");
                            running = false;
                            break;

                        default:
                            System.out.println("Ungültige Auswahl. Bitte erneut eingeben.");
                    }
                } else {
                    System.out.println("Die Zahl muss zwischen 0 und 5 liegen.");
                }
            } else {
                System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben.");
                sc.next(); // Ungültige Eingabe entfernen
            }
        }

        sc.close();
    }

    private static void printMenu() {
        System.out.println("Es wird unten das Menü ausgegeben:");
        System.out.println("1. Anlegen eines Arrays mit Beispielnoten");
        System.out.println("2. Berechne Durchschnitt");
        System.out.println("3. Berechne Abweichungen");
        System.out.println("4. Anlegen eines Arrays mit Strings");
        System.out.println("5. Umkehren eines Strings");
        System.out.println("0. Beenden");
    }

    // Aufgabe 1: Anlegen eines Notenarrays
    public static int[] legeNotenArrayAn() {
        int[] notenArray = {3, 5, 4, 2, 1};
        System.out.println("Notenarray: " + Arrays.toString(notenArray));
        return notenArray;
    }

    // Aufgabe 2: Durchschnitt berechnen
    public static double berechneDurchschnitt(int[] notenArray) {
        double summe = 0;
        for (int i = 0; i < notenArray.length; i++) {
            int note = notenArray[i];
            summe += note; // Automatische Konvertierung zu double
        }
        double durchschnitt = summe / notenArray.length;
        System.out.println("Das ursprüngliche Array war: " + Arrays.toString(notenArray));
        System.out.println("Nun wurde der Durchschnitt berechnet:");
        System.out.println("Durchschnitt: " + durchschnitt);
        return durchschnitt;
    }

    // Aufgabe 3: Abweichungen berechnen
    public static double[] berechneAbweichung(int[] notenArray, double durchschnitt) {
        double[] abweichungen = new double[notenArray.length];
        for (int i = 0; i < notenArray.length; i++) {
            abweichungen[i] = notenArray[i] - durchschnitt;
        }
        System.out.println("Das ursprüngliche Array war: " + Arrays.toString(notenArray));
        System.out.println("Nun wurde auch die Abweichungen zu den einzelnen Noten berechnet.");
        System.out.println("Abweichungen: " + Arrays.toString(abweichungen));
        return abweichungen;
    }

    // Aufgabe 4: Anlegen eines String-Arrays
    public static String[] legeStringArrayAn() {
        String[] arrayVorgegeben = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        System.out.println("Das String-Array ist: " + Arrays.toString(arrayVorgegeben));
        return arrayVorgegeben;
    }

    // Aufgabe 5: Array umkehren
    public static void reverseArray(String[] arrayVorgegeben) {
        System.out.println("Das ursprüngliche Array in der normalen Reihenfolge war: " + Arrays.toString(arrayVorgegeben));
        for (int i = 0; i < arrayVorgegeben.length / 2; i++) {
            String temp = arrayVorgegeben[i];
            arrayVorgegeben[i] = arrayVorgegeben[arrayVorgegeben.length - 1 - i];
            arrayVorgegeben[arrayVorgegeben.length - 1 - i] = temp;
        }
        System.out.println("Nun wurde die Reihenfolge der Inhalte des Arrays umgekehrt.");
        System.out.println("Umgekehrtes Array: " + Arrays.toString(arrayVorgegeben));
    }
}