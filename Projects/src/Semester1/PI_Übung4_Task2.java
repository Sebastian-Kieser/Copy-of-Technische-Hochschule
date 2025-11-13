package Semester1;

import java.util.Scanner;

    public class PI_Übung4_Task2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            int x;
            int n;
            System.out.println("Es werden nun 3 Integer Variablen a,b,c erstellt.");
            int a, b, c;
            System.out.println("Dabei gibt a die Basis an und b den Exponenten. In c wird das Ergebnis gespeichert.");
            a = sc.nextInt();
            b = sc.nextInt();
            x = a;
            n = b;
            c = potenzen(x,n);
            System.out.println("Das Ergebnis ist: " + c);


        }
        public static int potenzen(int x, int n) {
            int aufgabe = 1;
            if (n == 0) {
                aufgabe = 1;
            } else {
                for (int i = 0; i < n; i++) {
                    aufgabe *= x;
                }
            }
            return aufgabe;
        }
    }