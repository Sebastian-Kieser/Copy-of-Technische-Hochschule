//import java.util.Arrays;
//import java.util.Scanner;
//
//public class PI_Praktikum3_Task3_Copy {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
////      Task 3: Menu points
////      Solution by Robin Meier & Sebastian Kieser
//
//        System.out.println("Es wird unten das Menü ausgegeben:");
//        System.out.println("1. Anlegen eines Arrays mit Beispielnoten");
//        System.out.println("2. Berechner Durchschnitt");
//        System.out.println("3. Berechne Abweichungen");
//        System.out.println("4. Anlegen eines Arrays mit Strings");
//        System.out.println("5. Umkehren eines Strings");
//        System.out.println("0. Beenden");
//        System.out.println("Gib nun eine Zahl ein, um ein Menüpunkt auszuwählen");
//
//        int menuePunkt;
//
//        while (true) {
//        String codeVonNeuBeginnen;
//        codeVonNeuBeginnen = sc.nextLine();
//            if (codeVonNeuBeginnen.equals("Ja")) {
//                code(sc);
//            } else {
//                System.out.println("Du hast den Code verlassen.");
//                break;
//            }
//        }
//    }
//
//// Von Aufgabe 1:
//
//    public static int[] legeNotenArrayAn() {
//        int[] notenArray = new int[5];
//        notenArray[0] = 3;
//        notenArray[1] = 5;
//        notenArray[2] = 4;
//        notenArray[3] = 2;
//        notenArray[4] = 1;
//        System.out.println("NotenArray: " + notenArray[0] + " " + notenArray[1] + " " + notenArray[2] + " " + notenArray[3] + " " + notenArray[4]);
//        return notenArray;
//    }
//
//    public static double berechneDurchschnitt(int[] notenArray) {
//        double ergebnis = 0;
//        for (int j : notenArray) {
//            ergebnis += j;
//        }
//        System.out.println("Durchschnitt: " + ergebnis / notenArray.length);
//        return ergebnis / notenArray.length;
//    }
//
//    public static double[] berechneAbweichung(int[] notenArray) {
//        double[] abweichungNotenArray = new double[5];
//        abweichungNotenArray[0] = 1.0;
//        abweichungNotenArray[1] = 2.0;
//        abweichungNotenArray[2] = 3.0;
//        abweichungNotenArray[3] = 4.0;
//        abweichungNotenArray[4] = 5.0;
//        double[] ergebnis = new double[5];
//        for (int i = 0; i < notenArray.length; i++) {
//            ergebnis[i] = notenArray[i] - abweichungNotenArray[i];
//        }
//        System.out.println("Abweichungen: " + ergebnis[0] + " " + ergebnis[1] + " " + ergebnis[2] + " " + ergebnis[3] + " " + ergebnis[4]);
//        return ergebnis;
//    }
//
////  Von Aufgabe 2:
//
//    public static String[] legeStringArrayAn (String[] arrayVorgegeben) {
//        arrayVorgegeben[0] = "1";
//        arrayVorgegeben[1] = "2";
//        arrayVorgegeben[2] = "3";
//        arrayVorgegeben[3] = "4";
//        arrayVorgegeben[4] = "5";
//        arrayVorgegeben[5] = "6";
//        arrayVorgegeben[6] = "7";
//        arrayVorgegeben[7] = "8";
//        arrayVorgegeben[8] = "9";
//        arrayVorgegeben[9] = "10";
//
//        return arrayVorgegeben;
//
//    }
//    public static String reverseArray(String[] arrayVorgegeben) {
//        int left = 0;
//        int right = arrayVorgegeben.length - 1;
//        while (left < right) {
//            String temp = arrayVorgegeben[left];
//            arrayVorgegeben[left] = arrayVorgegeben[right];
//            arrayVorgegeben[right] = temp;
//            left++;
//            right--;
//        }
//        System.out.println(Arrays.toString(arrayVorgegeben));
//        return Arrays.toString(arrayVorgegeben);
//    }
//
//    public static void codeVonNeuBeginnen (Scanner sc,int menuePunkt) {
//        String codeVonNeuBeginnen;
//        System.out.println("Möchtest du nun den Code von neu beginnen?");
//        System.out.println("Wenn ja, schreibe gleich 'Ja', ansonsten mit 'Nein' verlässt du den Code.");
//        codeVonNeuBeginnen = sc.nextLine();
//        if (codeVonNeuBeginnen.equals("Ja")){
//            menuePunkt = sc.nextInt();
//        } else {
//            System.out.println("Du hast den Code verlassen.");
//        }
//    }
//
//    public static void code (Scanner sc) {
//        int menuePunkt = -1;
//        int[] notenArray = new int[5];
//        String[] arrayVorgegeben = new String[10];
//
//        System.out.println("Wenn du den Code beginnen willst, schreibe 'Ja'.");
//        String codeBeginnen;
//        codeBeginnen = sc.nextLine();
//
//        while (codeBeginnen.contains("Ja")) {
//            System.out.print("Gib eine Zahl zwischen 0 und 5 ein: ");
//
//            // Prüfen, ob die nächste Eingabe eine Zahl ist
//            if (sc.hasNextInt()) {
//                menuePunkt = sc.nextInt();
//
//                // Überprüfen, ob die Zahl im gewünschten Bereich liegt
//                if (menuePunkt >= 0 && menuePunkt <= 5) {
//                    System.out.println("Eingabe akzeptiert: " + menuePunkt);
//                    switch (menuePunkt) {
//                        case 1:
//                            System.out.println("1. Anlegen eines Arrays mit Beispielnoten.");
//                            legeNotenArrayAn();
//                            break;
//                        case 2:
//                            System.out.println("2. Berechne Durchschnitt.");
//                            berechneDurchschnitt(notenArray);
//                            break;
//                        case 3:
//                            System.out.println("Berechne Abweichung.");
//                            berechneAbweichung(notenArray);
//                            break;
//                        case 4:
//                            System.out.println("Anlegen eines Arrays mit Strings.");
//                            legeStringArrayAn(arrayVorgegeben);
//                            break;
//                        case 5:
//                            System.out.println("Umkehren des String Arrays.");
//                            reverseArray(arrayVorgegeben);
//                            break;
//                        case 0:
//                            System.out.println("0. Ende");
//                            break;
//                    }
//                    codeVonNeuBeginnen(sc, codeBeginnen, menuePunkt, codeVonNeuBeginnen);
//                } else {
//                    System.out.println("Die Zahl muss zwischen 0 und 5 liegen. Versuche es erneut.");
//                }
//            } else {
//                // Falls keine Zahl eingegeben wurde
//                System.out.println("Ungültige Eingabe. Bitte gib eine Zahl ein.");
//                sc.next(); // Verbraucht die ungültige Eingabe
//            }
//        }
//    }
//}