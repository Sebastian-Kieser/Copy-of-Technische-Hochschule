package Semester1;

import java.util.Scanner;

public class PI_Praktikum3_Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] notenArray = legeNotenArrayAn();
        double[] abweichungen = berechneAbweichunge(notenArray);
        double ergebnis = berechneDurchschnitt(notenArray);
        sc.close();
    }

    private static int[] legeNotenArrayAn() {
        int[] notenArray = new int[5];
        notenArray[0] = 3;
        notenArray[1] = 5;
        notenArray[2] = 4;
        notenArray[3] = 2;
        notenArray[4] = 1;
        System.out.println("NotenArray: " + notenArray[0] + " " + notenArray[1] + " " + notenArray[2] + " " + notenArray[3] + " " + notenArray[4]);
        return notenArray;
    }

    private static double berechneDurchschnitt(int[] notenArray) {
        double ergebnis = 0;
        for (int j : notenArray) {
            ergebnis += j;
        }
        System.out.println("Durchschnitt: " + ergebnis / notenArray.length);
        return ergebnis / notenArray.length;
    }

    private static double[] berechneAbweichunge(int[] notenArray) {
        double[] abweichungNotenArray = new double[5];
        abweichungNotenArray[0] = 1.0;
        abweichungNotenArray[1] = 2.0;
        abweichungNotenArray[2] = 3.0;
        abweichungNotenArray[3] = 4.0;
        abweichungNotenArray[4] = 5.0;
        double[] ergebnis = new double[5];
        for (int i = 0; i < notenArray.length; i++) {
            ergebnis[i] = notenArray[i] - abweichungNotenArray[i];
        }
        System.out.println("Abweichungen: " + ergebnis[0] + " " + ergebnis[1] + " " + ergebnis[2] + " " + ergebnis[3] + " " + ergebnis[4]);
        return ergebnis;
    }
}