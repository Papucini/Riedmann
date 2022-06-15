package at.Burtscher.project.SWP;

import java.util.Scanner;

public class Waschmaschiene<anodernicht> {

    boolean anodernicht = false;
    int waschmittel = 0;


    while(!anodernicht);

    {
        System.out.println("1 An");
        System.out.println("2 Programm wählen");
        System.out.println("3 Waschmittel hinzugeben");
        System.out.println("4 Programm einschalten");
        System.out.println("5 Aus");

        Scanner scanner = new Scanner(System.in);
        int pressed = scanner.nextInt();

        if (pressed == 1) {
            anodernicht = true;
        } else if (pressed == 2) {
            System.out.println("Programm wählen");
            System.out.println("schnell 40min");
            System.out.println("mittel 60min");
            System.out.println("lang 120min");
        } else if (pressed == 3) {
            waschmittel = waschmittel + 100;
            System.out.println("Waschmittel gefüllt");
        } else if (pressed == 4) {
            if (waschmittel = 100) {
                System.out.println("Programm schnell wird gestartet");

            } else if (pressed == 5) {
                anodernicht = false;
                }
            }
        }
        }


    