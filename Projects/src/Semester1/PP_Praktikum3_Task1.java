package Semester1;

import java.util.Scanner;

public class PP_Praktikum3_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte gib einen Wert für a an:");
        int a;
        a = getValidInput(sc);

        System.out.println("Bitte gib einen Wert für b ein:");
        int b;
        b = getValidInput(sc);

        System.out.println("Bitte gib einen Wert für m ein:");
        int m;
        m = getValidInput(sc);

        if ( m == 0 ) {
            System.out.println("m darf nicht null sein, da wir sonst durch 0 teilen und das darf man nicht.");
            System.out.println("Mach eine neue Eingabe für m");
            m = getValidInput(sc);
        }

        int z = (int) ((Math.random()*101));
        System.out.println("Die Zufallszahl z ist: " + z);

        System.out.println("Die Aufgabe ist: (a * z + b) mod m.");
        System.out.println("Das Ergebnis ist: " + ( a * z + b ) % m);

    }
    private static int getValidInput (Scanner sc) {
        while (true){
            System.out.println("Bitte gib eine Zahl ein:");
            if (sc.hasNextInt()) {
                return sc.nextInt();
            } else {
                System.out.println("Bitte gib eine gültige Zahl ein:");
                sc.nextLine(); //Ungültiger Input wird verworfen
            }
        }
    }
}