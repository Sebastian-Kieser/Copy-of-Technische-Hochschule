package Semester1;

import java.util.Scanner;

    public class PI_Übung5_Task2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
//            Methode für Vektorsumme
            createArrays(sc);
        }
        public static int createArrays(Scanner sc) {
            System.out.println("Enter the size of the array: A");
            int arrayA = sc.nextInt();
            int[] a = new int[arrayA];
            System.out.println("Enter the size of the array: B");
            int arrayB = sc.nextInt();
            int d;
            int[] c = new int[arrayA];
            if (arrayA != arrayB) {
                d = -1;
                System.out.println("The arrays are not the same: " + d);
                return d;
            }
            int[] b = new int[arrayB];
            System.out.println("Enter the elements of the array: A");
            for (int i = 0; i < arrayA; i++) {
                a[i] = sc.nextInt();
            }
            for (int i = 0; i < arrayA; i++) {
                System.out.println("The Elements of the array A: " + a[i]);
            }
            System.out.println("Enter the elements of the array: B");
            for (int i = 0; i < arrayB; i++) {
                b[i] = sc.nextInt();
            }
            for (int i = 0; i < arrayB; i++) {
                System.out.println("The Elements of the array B:" + b[i]);
            }
            System.out.println("Now we sum the Array A and Array B:");
            for (int i = 0; i < arrayA; i++) {
                c[i] = a[i] + b[i];
            }
            for (int i = 0; i < arrayA; i++) {
                System.out.println("The Elements of the array C: " + c[i]);
            }
            return 0;
        }
    }