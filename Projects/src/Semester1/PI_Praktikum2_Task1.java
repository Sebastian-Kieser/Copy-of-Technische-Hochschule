package Semester1;

import java.util.Scanner;

public class PI_Praktikum2_Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = 4, b = 2, c;
        c= a+b/3;
        System.out.println(c);
        int menuePunkt = 1;
        while(menuePunkt != 0) {
            System.out.println("Menü:");
            System.out.println("1. Datei");
            System.out.println("2. Drucken");
            System.out.println("3. Speichern");
            System.out.println("4. Hilfe");
            System.out.println("0. Beenden");

            System.out.println("Bitte wähle ein Munüpunkt aus, indem du die Zahl angibst.");
            menuePunkt = sc.nextInt();
            switch (menuePunkt){
                case 0:
                    System.out.println("0. Beenden");
                    break;
                case 1:
                    System.out.println("1. Datei");
                    break;
                case 2:
                    System.out.println("2. Drucken");
                    break;
                case 3:
                    System.out.println("3. Speichern");
                    break;
                case 4:
                    System.out.println("4. Hilfe");
                    break;
                default: System.out.println("Die Eingabe ist ungültig!");
                    break;
            }
        }
    }
}