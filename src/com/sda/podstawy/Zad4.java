package com.sda.podstawy;

import java.util.Scanner;
public class Zad4 {
    public static void main(String[] args) {

        int zmienna1;
/*        do {
            System.out.println("wprowadz liczbę naturalną");
            Scanner text = new Scanner(System.in);
            zmienna1 = text.nextInt();

        }
        while (zmienna1 < 0);



        System.out.println("Bomba wybuchnie za:");
        for (int i = zmienna1; i >= 0; i--) {
            System.out.println(i);
        }
*/



        int zmienna2;
        do {
            System.out.println("wprowadz liczbę, różna od zera ");
            Scanner text = new Scanner(System.in);
            zmienna2 = text.nextInt();
        }


        while (zmienna2 == 0); {


            int suma = 0;
            int suma1 = 0;

            if (zmienna2 >0) {
                System.out.println("Suma wszyskich poprzedzających liczb, liczbę " + zmienna2 + " to:");


                int licznik=0;
                while (licznik<=zmienna2)
                suma+=licznik++;
                System.out.println(suma);
                /*for (int i = zmienna2; i >= 0; i--) {

                    suma += i;
                }
                System.out.println(suma);*/
            } else {
                System.out.println("Suma wszyskich następujących policzbie, liczbę " + zmienna2 + " to:");

                int licznik=0;
                while (licznik<=zmienna2*(-1))
                    suma1+=licznik++;
                System.out.println(suma1);
               /*
                for (int i = (-1*zmienna2); i >= 0; i--) {

                    suma1 += i;

                }
                System.out.println(suma1);
*/

            }
        }

    }


    }
