package Semester1;

import java.util.Scanner;

public class Simple_Operations_Java_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String exit = "exit";

        int anzahlFuenfziger;
        int anzahlZwanziger;
        int anzahlZweier;
        int anzahlEiner;
        while (true) {
            System.out.println("Gib einen Geldbetrag an in 2 Eurostücken, Ein Eurostücken, 0,2 Eurostücken und 0,5 Eurostücken");
            System.out.println("Gib die Menge an Zweiern an:");
            anzahlZweier = sc.nextInt();
            System.out.println("Gib die Menge an Einern an:");
            anzahlEiner = sc.nextInt();
            System.out.println("Gib die Menge an Zwanzigern an:");
            anzahlZwanziger = sc.nextInt();
            System.out.println("Gib die Menge an Fünfzigern an:");
            anzahlFuenfziger = sc.nextInt();
            System.out.println("Die Beträge der einzelnen Münzen beträgt:");
            System.out.println("Der Betrag an Zweiern ist: " + anzahlZweier);
            System.out.println("Der Betrag an Einern ist: " + anzahlEiner);
            System.out.println("Der Betrag an Zwanzigern ist: " + anzahlZwanziger);
            System.out.println("Der Betrag an Fuenfziger ist: " + anzahlFuenfziger);
            int gesamtBetrag = (anzahlZweier * 2) + anzahlEiner + (anzahlZwanziger / 5) + (anzahlFuenfziger / 2);
            System.out.println("Der Gesamtbetrag ist: " + gesamtBetrag);
            System.out.println("Wenn du die Schleife verlassen willst, gib exit ein.");
            sc.nextLine();
            if (sc.nextLine() != "exit") {
                System.out.println("Du hast die Schleife verlassen");
                break;
            }
        }
    }
}