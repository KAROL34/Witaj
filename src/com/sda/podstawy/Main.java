package com.sda.podstawy;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        System.out.print("Podaj Imię:");
	Scanner wejście = new Scanner(System.in);
        String tekst = wejście.nextLine();


    System.out.println("Witaj \n" + tekst+"!");
    for (int i=0; i<10; i+=2)
    {
        System.out.println(i);
    }
    }
}
