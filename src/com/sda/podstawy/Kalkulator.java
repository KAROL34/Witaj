package com.sda.podstawy;
import java.util.Scanner;
public class Kalkulator {
    public static void main(String[] args) {
      /*  double zmienna1 =150.0;
        double zmienna2 = 0.0;
        double wynik;
        char kod ='d';

        if (kod == 'p')
        {
            wynik = zmienna1 +zmienna2;
        }
        else if (kod == 'o')
        {
            wynik = zmienna1 - zmienna2;
        }
        else if (kod == 'm')
        {
            wynik = zmienna1 * zmienna2;
        }
        else if (kod == 'd')
        wynik=zmienna2!=0?zmienna1/zmienna2:0.0;

        else
        {
            wynik = 0.0;
        }

        System.out.println(wynik);
        */
        System.out.println("Wpisz liczbe");
        Scanner wejście2 = new Scanner(System.in);
        int liczba =wejście2.nextInt();
if (liczba>10)
        {
            System.out.println("Liczba jest większa od 10");
        }
else if (liczba<10)
{
    System.out.println("Liczba jest mniejsza od 10");
}
else
    System.out.println("Liczba jest równa  10");


        }
    }

