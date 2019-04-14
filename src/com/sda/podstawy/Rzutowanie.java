package com.sda.podstawy;

public class Rzutowanie {
    public static void main(String[] args) {
        float zmiennaF=1.0f;
        double zimennaD=4.0d;
        byte ziennaB = 7;
        short zmiennaS=7;
        long ziennaL=5;
       short wynik1=ziennaB;
       short wynik2= (short) ziennaL;
       short wynik3 = (short) ziennaB;
       long wynik4= ziennaB-ziennaL;
       short wynik5= (short)(ziennaB-ziennaL);
        float wynik6 =ziennaL-ziennaB;
        long wynik7=(long) (zmiennaS-ziennaB+zmiennaF+zimennaD);

        System.out.println(wynik7);
    }
}
