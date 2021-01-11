/**
 * BMI = Körpermasse (kg) / Körpergröße zum Quadrat (m**2).
 *
 * Er wird wie folgt interpretiert:
 *
 * Starkes Untergewicht < 16
 * Mäßiges Untergewicht 16 – < 17
 * Leichtes Untergewicht 17 – < 18,5
 *
 * Normalgewicht 18,5 – < 25
 *
 * Präadipositas 25 – < 30
 *
 * Adipositas Grad I 30 – < 35
 * Adipositas Grad II 35 – < 40
 * Adipositas Grad III ≥ 40
 *
 * Man schreibe ein Programm, das die zwei Basisdaten (Körpermasse und Körpergröße) entgegennimmt und den
 * Zustand (Starkes Untergewicht, Mäßiges Untergewicht ... Adipositas Grad III) als Ergebnis mitteilt.
 */

package com.company;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        DecimalFormat f = new DecimalFormat("#0.00");
        double bodyMassIndex,bodyWeight,bodyHeight;
        Scanner scanny = new Scanner(System.in);
        System.out.println("Bitte geben sie ihr Gewicht in Kilogramm an");
        bodyWeight = scanny.nextDouble();
        System.out.println("Bitte geben sie ihre Größe in Meter an");
        bodyHeight = scanny.nextDouble();
        bodyMassIndex = bodyWeight/(bodyHeight*bodyHeight);
        System.out.println("Ihr Body Mass Index (BMI) :  " + f.format(bodyMassIndex) );
                if (bodyMassIndex <16) {
            System.out.println("Sie haben Starkes Untergewicht!" );
        }
        else if(bodyMassIndex >16 && bodyMassIndex <=17){
            System.out.println("Sie haben mäßiges Untergewicht." );
        }
        else if(bodyMassIndex >=17 && bodyMassIndex < 18.5){
            System.out.println("Sie haben leichtes Untergewicht." );
        }
        else if(bodyMassIndex >=18.5 && bodyMassIndex < 25){
            System.out.println("Sie haben Normalgewicht" );
        }
        else if(bodyMassIndex >=25 && bodyMassIndex < 30){
            System.out.println("Sie haben Präadipositas." );
        }
        else if(bodyMassIndex >=30 && bodyMassIndex < 35){
            System.out.println("Sie haben Adipositas Grad I ." );

        }
        else if(bodyMassIndex >=35 &&bodyMassIndex <40){
            System.out.println("Sie haben Adipositas Grad II." );
        }
        else if(bodyMassIndex >40){
            System.out.println("Sie haben Adipositas Grad III." );
        }
    }


}
