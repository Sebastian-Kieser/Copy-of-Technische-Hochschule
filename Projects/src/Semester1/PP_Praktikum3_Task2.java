package Semester1;

import java.util.Scanner;

public class PP_Praktikum3_Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Task 3: Calculation of random Number in method
//        Solution by Robin Meier & Sebastian Kieser

        System.out.println("Gib eine Zahl für a ein:");
        int a;
        a = sc.nextInt();
        System.out.println("a ist: " + a);

        System.out.println("Gib eine Zahl für b ein:");
        int b;
        b = sc.nextInt();
        System.out.println("a ist: " + b);

        System.out.println("Gib eine Zahl für m ein:");
        int m;
        m = sc.nextInt();
        while ( m == 0) {
            if ( m == 0) {
                System.out.println("m darf nicht null sein! Mach eine neue Eingabe.");
                m = sc.nextInt();
            } else {
                break;
            }
        }
        System.out.println("m ist: " + m);

        System.out.println("Nun wird die Zufallszahl z berechnet.");
        int[] z = new int[20];
        z[0] = 0;
        for (int i = 1; i < 20; i++) {
            z[i] = getValidRandomNumber(sc);
        }
        for (int i = 0; i < 20; i++) {
            int calculation;
            calculation = ( z[i] * a + b) % m;
            System.out.println(calculation);
        }
    }
    private static int getValidRandomNumber(Scanner sc) {
        int z;
        int[] z1 = new int[20];
        for (int i = 1; i < 20; i++){
            z = (int) (Math.random() * 101);
            z1[i] = z;
        }
        return 0;
    }
}