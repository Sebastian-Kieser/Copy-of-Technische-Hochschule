package Semester1;

import java.util.Scanner;

public class Versuch1_Task1_copy {
    public static void main(String[] args) {
        //Task1: Creation  of random pseudo-numbers
        //Solution by Robin Meier & Sebastian Kieser
       /*
       The scanner checks the input of the user and reads the console.
       This is important because only then we can let a method check if the
       user uses the right form for the type integer or String...
        */
        Scanner scanner = new Scanner(System.in);

        while (true) {
        /*
        Math.random is a method that gives you a random number in a
         */
            int z = (int) ((Math.random()) * 101);

            System.out.println("Gib einen Wert für a ein:");
            int a;
            a = scanner.nextInt();

            System.out.println("Gib einen Wert für b ein:");
            int b;
            b = scanner.nextInt();

            System.out.println("Gib einen Wert für m ein:");
            int m;
            m = scanner.nextInt();

            System.out.println("Die Eingabe für a ist: " + a);
            System.out.println("Die Eingabe für b ist: " + b);
            System.out.println("Die Eingabe für m ist: " + m);
            System.out.println("Die Zufallszahl für z ist: " + z);

            System.out.println("Das Ergebnis ist: " + (a * z + b) % m);

            System.out.println("Wenn du die Schleife verlassen willst, gib exit ein.");
            scanner.nextLine();
            if (scanner.nextLine().equals("exit")) {
                System.out.println("Du hast die Schleife verlassen.");
                break;
            }
        scanner.close();
        }
    }
}

//    private static int getIntInput(Scanner scanner, String prompt) {
//        int number;
//        while (true) {
//            System.out.println(prompt);
//            if (scanner.hasNextInt()) {
//                number = scanner.nextInt();
//                break;
//            } else {
//                System.out.println("Die Eingabe ist ungültig, bitte gib eine Zahl ein.");
//                scanner.next();
//            }
//        }
