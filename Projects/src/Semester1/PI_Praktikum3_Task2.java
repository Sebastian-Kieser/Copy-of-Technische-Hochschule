package Semester1;

import java.util.Arrays;
import java.util.Scanner;

public class PI_Praktikum3_Task2 {
    public static void main(String[] args) {
//      Task 4: Array in umgekehrter Reihenfolge
//      Solution by Robin Meier & Sebastian Kieser
        Scanner sc = new Scanner(System.in);

        System.out.println("Nun wird ein Beispielarray erzeugt.");
        String[] arrayVorgegeben;
        arrayVorgegeben = legeStringArrayAn(new String[10]);
        System.out.println("Das Array wurde erstellt und befüllt.");
        System.out.println("Nun wird das Array in umgekehrter Reihenfolge ausgegeben.");
        reverseArray(arrayVorgegeben);

    }

    private static String[] legeStringArrayAn(String[] arrayVorgegeben) {
        arrayVorgegeben[0] = "1";
        arrayVorgegeben[1] = "2";
        arrayVorgegeben[2] = "3";
        arrayVorgegeben[3] = "4";
        arrayVorgegeben[4] = "5";
        arrayVorgegeben[5] = "6";
        arrayVorgegeben[6] = "7";
        arrayVorgegeben[7] = "8";
        arrayVorgegeben[8] = "9";
        arrayVorgegeben[9] = "10";
        return arrayVorgegeben;
    }
    private static void reverseArray(String[] arrayVorgegeben) {
        int left = 0;
        int right = arrayVorgegeben.length - 1;

        while (left < right) {
            String temp = arrayVorgegeben[left];
            arrayVorgegeben[left] = arrayVorgegeben[right];
            arrayVorgegeben[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arrayVorgegeben));
    }
}