package com.sda.podstawy;

public class zadania2 {
    public static void main(String[] args) {
        boolean a = 2==2&&3==4;
        boolean b = 2!=8 || 2==2;
        boolean c ="test"=="test";
        boolean d = (2+9)>(15-5);
/*
        System.out.println("2==2&&3==4: "+a);
        System.out.println("2!=8 || 2==2"+b);
        System.out.println("\"test\"==\"test\""+c);
        System.out.println(d);

        if (6>8)
            System.out.println("to Prawda");
        else
            System.out.println("błąd");
        if (8<9)
            System.out.println("to Prawda");
        else
            System.out.println("błąd");
        if ((2-2)==0)
            System.out.println("to Prawda");
        else
            System.out.println("błąd");
        if (9%3!=0)
            System.out.println("to Prawda");
        else
            System.out.println("błąd");
            */
        boolean [] tabwyr={a, b, c, d};
        //                                  FOR
        for (int i =0; i<tabwyr.length;i++)
        {
            if (tabwyr[i])
                System.out.println("to Prawda");
            else
                System.out.println("błąd");
        }
        for (boolean x:tabwyr)

            if (x)
                System.out.println("to Prawda");
            else
                System.out.println("błąd");
//                  WHILE
        int licznik=0;
            while (licznik<tabwyr.length)
            {

                 if(tabwyr[licznik])
                    System.out.println("to Prawda");
                else
                    System.out.println("błąd");

                licznik++;
                }
        int licznik1=0;
    // DO WHILE

            do
            {
                if(tabwyr[licznik1])
                    System.out.println("to Prawda");
                else
                    System.out.println("błąd");
            licznik1++;}
                while (licznik1<tabwyr.length);
//              CASE


        }


        }


