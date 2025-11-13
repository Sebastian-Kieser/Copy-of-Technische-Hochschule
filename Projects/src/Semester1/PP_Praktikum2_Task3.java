package Semester1;

import java.util.Scanner;

    public class PP_Praktikum2_Task3 {
        public static void main(String[] args) {
        // Task3: The "bumm"-game
        // Solution by Robin Meier & Sebastian Kieser

        Scanner sc = new Scanner(System.in);
        String exit = "exit";
        while (true) {
            System.out.println("Wenn du das Spiel verlassen willst, gib exit ein.");
            if (sc.nextLine().equals("exit")) {
                System.out.println("Du hast das Game verlassen");
                break;
            } else {
                int number10er;
                int number1er;
                for (number10er = 0; number10er < 100; number10er += 10) {
                    if (String.valueOf(number10er).contains("7")) {
                        System.out.println("BUMM");
                    }
                    for (number1er = 0; number1er < 10; number1er++) {
                        if (String.valueOf(number1er).contains("7")) {
                            System.out.println("BUMM");
                        } else if ((number10er + number1er) % 7 == 0) {
                            System.out.println("BUMM");
                        } else if (String.valueOf(number10er).contains("7")) {
                            System.out.println("BUMM");
                        } else {
                            System.out.println(number10er + number1er);
                        }
                    }
                }
            }
        }
    }
}