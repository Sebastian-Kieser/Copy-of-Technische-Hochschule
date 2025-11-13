package Semester1;

import java.util.Scanner;

public class Simple_Operations_Java_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean weiter = true;
        while (weiter) {

            System.out.println("Du willst das Arytmetische Mittel 3er Variablen berechnen.");
            System.out.println("Gib den Wert der ersten Variable a ein:");
            int a;
            a = sc.nextInt();
            System.out.println("Gib den Wert der zweiten Variable b ein:");
            int b;
            b = sc.nextInt();
            System.out.println("Gib den Wert der dritten Variable c ein:");
            int c;
            c = sc.nextInt();
            System.out.println("Die angegebenen Werte für die Variablen sind:");
            System.out.println("Für a :" + a);
            System.out.println("Für b :" + b);
            System.out.println("Für c :" + c);

            int result = ( a + b + c) / 3;
            System.out.println("Das Arythmetische Mittel ist: " + result);
            String ergebnis = String.valueOf(result);
            System.out.println("Das Arythmetische Mittel mit Nachkommastellen ist:" + ergebnis);
            System.out.println("Wenn du erneut anfangen willst gib neustart ein, fürs Verlassen exit");
            sc.nextLine();
            if (sc.nextLine().equalsIgnoreCase("exit")) {
                System.out.println("Du hast die Schleife verlassen.");
                weiter = false;
            }
        }
        sc.close();
    }
}