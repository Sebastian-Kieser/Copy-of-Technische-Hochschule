package Semester1;

import java.util.Scanner;

public class PP_P1_Task1_RandomNumber {
    public static void main(String[] args) {

        //Task1: Creation  of random pseudo-numbers
        //Solution by Sebastian Kieser ( 11407472 )
       /*
       The scanner checks the input of the user and reads the console.
       This is important because only then we can let a method check if the
       user uses the right form for the type integer or String...
        */
        Scanner scanner = new Scanner(System.in);

        /*
        Math.random is a method that gives you a random number in a
         */
        int z = (int)((Math.random())*101);
        System.out.println("Die Zufallszahl für z ist:" + z);

        int a = getIntInput(scanner, "Gib eine Zahl für a ein:");
        int b = getIntInput(scanner, "Gib eine Zahl für b ein:");
        int m = getIntInput(scanner, "Gib eine Zahl für m ein:");

        if ( m == 0) {
            System.out.println("m darf nicht null sein! Mach eine neue Eingabe!");
            m = scanner.nextInt();
        }

        System.out.println("Die Zufallszahl für z ist: " + z);
        System.out.println("Das Ergebnis ist: " + (a * z + b) % m);

        scanner.close();
    }

    private static int getIntInput(Scanner scanner, String prompt) {
        int number;
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println("Die Eingabe ist ungültig, bitte gib eine Zahl ein.");
                scanner.next();
            }
        }
        return number;
    }
}