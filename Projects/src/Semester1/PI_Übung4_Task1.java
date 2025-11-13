package Semester1;

import java.util.Scanner;

    public class PI_Übung4_Task1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);

            System.out.println("Gib eine Zahl für die Variable a ein:");
            double a = sc.nextDouble();
            System.out.println("Deine Zahl für a ist: "  + a);
            int s = 0;
            testNumber(a,s);

            int[] arrayC = {1, 2, 3, 4, 5};
            for (int i = 0; i < arrayC.length; i++) {
                int index = i;
            }
        }
        public static double testNumber(double a, int s) {
            if (a < 0){
                s = - 1;
            } else if (a == 0){
                s = 0;
            } else if (a > 0) {
                s = 1;
            }
            System.out.println("Das Ergebnis für s ist: " + s);
            return s;
        }
    }