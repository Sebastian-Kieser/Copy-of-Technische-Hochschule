package Semester1;

import java.util.Scanner;

    public class PI_Übung5_Task1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
//            Skalarprodukt berechnen
            int[] a = new int[4];
            a[0] = 1;
            a[1] = 2;
            a[2] = 3;
            a[3] = 4;
            int[] b = new int[4];
            b[0] = 5;
            b[1] = 6;
            b[2] = 7;
            b[3] = 8;

            int[] skpr = new int[4];
            int skp = 0;
            for (int i = 0; i < 4; i++) {
                skpr[i] = a[i] * b[i];
            }
            for (int i = 0; i < 4; i++) {
                skp += skpr[i];
            }
            System.out.println("Das Skalarprodukt ist: " + skp);
        }
    }