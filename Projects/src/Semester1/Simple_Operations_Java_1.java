package Semester1;

import java.util.Scanner;

public class Simple_Operations_Java_1 {
    public static void main(String[] args) {
    //Task: Change the value of 2 variables
    //Solution by Robin Meier & Sebastian Kieser

    Scanner scanner = new Scanner(System.in);

    System.out.println("Gib eine Eingabe für die Variable A ein");
    int variableA = scanner.nextInt();
    System.out.println("Die Eingabe für A ist: " + variableA);

    System.out.println("Gib eine Eingabe für B ein");
    int variableB = scanner.nextInt();
    System.out.println("Die Eingabe für B ist: " + variableB);

    while (true) {
    if (variableA == variableB) {
        System.out.println("Die Eingaben sind gleich, bitte gib eine neue für beide ein.");
        variableA = scanner.nextInt();
        System.out.println("Die neue Eingabe für A ist: " + variableA);
        variableB = scanner.nextInt();
        System.out.println("Die neue Eingabe für B ist: " + variableB);
        }
        int variableC = variableA;
        variableA = variableB;
        variableB = variableC;
        break;
    }
    System.out.println("Der neue Wert für A ist: " + variableA);
    System.out.println("Der neue Wert für B ist: " + variableB);

    scanner.close();
    }
}