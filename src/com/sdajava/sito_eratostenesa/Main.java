package com.sdajava.sito_eratostenesa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj zakres, dla ktorego chcesz wyswietlic liczby pierwsze: ");

        int n = scanner.nextInt();
        double pierwiastek = Math.sqrt(n);

        boolean[] lp = new boolean[n + 1];              //zakladamy tablice, domyslnie ma wartosc false

        for(int i = 2; i < n+1; i++)                    //liczby z przedzialu od 2 do n sa pierwsze wskakuje wartosc true
            lp[i] = true;
        for(int i = 2; i <= pierwiastek; i++){          //petla usuwajaca wielokrotnosci kolejnych liczb
            if(lp[i]){                                  //sprawdzamy czy jest liczba pierwsza
                for (int j=i*i; j<=n; j=j+i)            //jesli tak to sprawdzamy jej wielokrotnosci
                    lp[j] = false;
            }
        }
        for (int i = 2; i <= n; i++)                    //petla wyswietlajaca wartosci od 2 do n
            if (lp[i])                                  //jesli wartosc i jest rowna true to jest liczba pierwsza
                System.out.print(" " + i);
    }
}
