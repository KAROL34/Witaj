package com.sda.podstawy;

public class ZAD5 {
    public static void main(String[] args) {
        int[] tablica = {1, 3, 5, 10};
        System.out.println("Tablica zawiera następujące elementy:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println("index " + i + " to w tablicy wartosc" + tablica[i]);
        }
        System.out.println("Tablica zawiera następujące elementy:");
        for (int i = 0; i < tablica.length; i++) {
            System.out.println(tablica[i]);
        }
        System.out.println("tylko nieparzyste elementy:");
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] % 2 != 0) {
                System.out.println(tablica[i]);
            }
        }
        System.out.println("tylko nieparzyste indexy:");
        for (int i = 0; i < tablica.length; i++) {
            if (i% 2 != 0) {
                System.out.println(tablica[i]);
            }


        }
        System.out.println("odwrotnie:");
        for (int i = tablica.length-1; i >= 0; i--) {

            System.out.println(tablica[i]);

        }
    }
}