package Semester1;

import java.util.Scanner;

    public class PI_Übung6_Task1 {
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
//            Klassendefinition zur Benutzerverwaltung in einem Betriebssystem

            class User {
                public String kennung = sc.nextLine();;
                private String passwort;
                private String checkPasswort(String kennung){
                    if(kennung.equals(this.passwort)){
                        return "0";
                    } else {
                        return "1";
                    }
                }
                private String setPasswort(String passwort){
                    System.out.println("Gib nun das alte Passwort ein:");
                    sc.nextLine();
                    if(sc.nextLine().equals(this.passwort)){
                        System.out.println("Du kannst nun ein neues Passwort eingeben.");
                        this.passwort = sc.nextLine();
                        System.out.println("Das neue Passwort ist:" + this.passwort);
                        return "0";
                    } else {
                        System.out.println("Du kannst nun ein neues Passwort ein.");
                        return "-1";
                    }
                }
            }
        }
    }
