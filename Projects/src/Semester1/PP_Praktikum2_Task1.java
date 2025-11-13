package Semester1;

import java.util.Scanner;

public class PP_Praktikum2_Task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Es gibt folgende Ports zu Auswahl:");
        System.out.println("well-known port für numbers >=0 bis numbers <= 1023");
        System.out.println("registered ports für numbers >= 1024 bis numbers <= 49151");
        System.out.println("dynamic ports für numbers >= 49152 bis numbers <= 65535");
        System.out.println("Falls du den Durchlauf verlassen willst, schreibe -1.");
        System.out.println("Gib eine Nummer im Bereich von 0 bis 65535 ein, um einen Port zu wählen.");

        int number;
        number = sc.nextInt();

        while (number > 65535) {
            System.out.println("Die Eingabe ist ungültig, bitte mach eine neue.");
            number = sc.nextInt();
            if (number >= 0 && number <= 65535) {
                System.out.println("Die Eingabe ist gültig.");
                break;
            }
        }

        while (number >= 0 && number <= 65535) {
            System.out.println("Die Eingabe ist gültig.");

            if (number <= 1023) {
                System.out.println("well-known port.");
                System.out.println("Die Dienste für diesen Port sind:");
                System.out.println("Port 21: FTP ( File Transfer Protocol, Übertragung von Dateien )");
                System.out.println("Port 23: Telnet ( Einloggen in entfernte Rechner )");
                System.out.println("Port 25: SMTP ( Simple Mail Transfer Protocol, Mailversand )");
                System.out.println("Port 80: HTTP ( HyperText Transfer Protocol, Zugriff auf Web-Server )");
                System.out.println("Port 143: IMAP ( Internet Message Access Protocol, Zugriff auf Mail-Server )");
                if (number == 21) {
                    System.out.println("Port: well-known --> FTP ( File Transfer Protocol )");
                }
                if (number == 23) {
                    System.out.println("Port: well-known --> Telnet ( Einloggen in entfernte Rechner )");
                }
                if (number == 25) {
                    System.out.println("Port: well-known --> SMTP ( Simple Mail Transfer Protocol )");
                }
                if (number == 80) {
                    System.out.println("Port: well-known --> HTTP ( HyperText Transfer Protocol )");
                }
                if (number == 143) {
                    System.out.println("Port: well-known --> IMAP ( Internet Message Access Protocol )");
                }
                if (number != 21 && number != 23 && number != 25 && number != 80 && number != 143) {
                    System.out.println("Port: well-known --> Sonstiger Dienst");
                }
            }
            if (number >= 1024 && number <= 49151) {
                System.out.println("registered port");
            }

            if (number >= 49152) {
                System.out.println("dynamic port");
            }

            System.out.println("Nun kannst du entweder eine neue Eingabe machen, um einen neuen Dienst zu wählen, oder du gibst -1 ein, um den Durchlauf zu verlassen.");
            number = sc.nextInt();
            if (number == -1) {
                System.out.println("Du hast den Durchlauf verlassen.");
                break;
            }
        }
    }
}