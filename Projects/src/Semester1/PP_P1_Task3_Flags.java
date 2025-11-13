package Semester1;

import java.util.Scanner;

public class PP_P1_Task3_Flags {
    public static void main(String[] args) {
        // Task3: Calculation the value of flags
        // Solution by Sebastian Kieser ( 11407472 )

        Scanner scanner = new Scanner(System.in);

        // Variable flags with 16 bits
        short flags = 0b0000000000010000;

        // Variable k with a value between 0 and 15
        System.out.println("Gib einen Wert für k ein (zwischen 0 und 15):");
        byte k = scanner.nextByte();

        // Ensure k is within the valid range
        if (k < 0 || k > 15) {
            System.out.println("Ungültiger Wert für k. Bitte geben Sie einen Wert zwischen 0 und 15 ein.");
            return;
        }

        // Calculate the value of the k-th bit
        int b = (flags >> k) & 1;

        // Output the result
        System.out.println("Der Wert des " + k + "-ten Bits von flags ist: " + b);

        scanner.close();
    }
}