package com.sda.podstawy;

import java.sql.SQLOutput;

public class zad3 {
    public static void main(String[] args) {
        double[] zmienneLewe = {100.0d, 25.0d, 225.0, 11.0};
        double[] zmiennePrawe = {50.0, 92.0d, 17.0d, 3.0d};
        char[] kodyDzialan = {'d', 'p', 'o', 'm'};
        double[] wyniki = new double[kodyDzialan.length];

        for (int i = 0; i < kodyDzialan.length; i++) {
            switch (kodyDzialan[i]) {
                case 'p':
                    wyniki[i] = zmienneLewe[i] + zmiennePrawe[i];
                    System.out.println(wyniki[i]);
                    break;
                case 'o':
                    wyniki[i] = zmienneLewe[i] - zmiennePrawe[i];
                    System.out.println(wyniki[i]);
                    break;
                case 'm':
                    wyniki[i] = zmienneLewe[i] * zmiennePrawe[i];
                    System.out.println(wyniki[i]);
                    break;
                case 'd':
                    wyniki[i] = zmiennePrawe[i] != 0 ? zmienneLewe[i] / zmiennePrawe[i] : 0;
                    System.out.println(wyniki[i]);
                    break;
                default:
                    System.out.println("Błąd - zły kod");
                    wyniki[i] = 0.0d;
                    break;

            }
        }
         /*   if (kodyDzialan[i] == 'p') {
                wyniki[i] = zmienneLewe[i] + zmiennePrawe[i];
            } else if (kodyDzialan[i] == 'm') {
                wyniki[i] = zmienneLewe[i] * zmiennePrawe[i];
            } else if (kodyDzialan[i] == 'o') {
                wyniki[i] = zmienneLewe[i] - zmiennePrawe[i];
            } else if (kodyDzialan[i] == 'd') {
                wyniki[i] = zmiennePrawe[i] != 0 ? zmienneLewe[i] / zmiennePrawe[i] : 0;
            } else {
                System.out.println("Błąd - zły kod");
                wyniki[i] = 0.0d;*/


         /*   }
                for (double wynik : wyniki) {
                    System.out.println(wynik);
                }

*/
    }
}
