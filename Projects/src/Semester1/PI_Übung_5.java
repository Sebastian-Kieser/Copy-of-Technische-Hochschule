package Semester1;

import java.util.Arrays;
import java.util.Scanner;

public class PI_Übung_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];
        int[] b = new int[4];
        int[] c = new int[4];
        int skp;
        System.out.println("Mache eine Eingabe für das Array a:");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array a ist: " + Arrays.toString(a));
        System.out.println("Mache eine Eingabe für das Array b:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.println("Array b ist: " + Arrays.toString(b));
        System.out.println("Nun soll das Skalarprodukt berechnet werden:");
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] * b[i];
            System.out.println(c[i]);
        }
        for (int i = 0; i < c.length; i++) {
            
        }
    }
}