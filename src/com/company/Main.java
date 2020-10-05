package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int insättning = 1000;
        double ränta = 0.09;
        double ränteVinstPerÅr = insättning * ränta;

        for(double i = 0; i <= 10; i++){

        double sum = ränteVinstPerÅr * i;

        System.out.println(sum + insättning);
        }

    }
}




/*     Räkna ut kvadraten mellan talen 1 - 9
        double tal=1;

        while (tal<=9.0) {

            System.out.println(Math.sqrt(tal));
            tal++;
        }
*/
