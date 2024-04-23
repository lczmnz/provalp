package org.example;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Collections;

public class bigbrother {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);
        ArrayList<String> bigBrother = new ArrayList<String>();

        bigBrother.add("Alane Dias");
        bigBrother.add("Beatriz Reis");
        bigBrother.add("Davi Brito");
        bigBrother.add("Deniziane Ferreira");
        bigBrother.add("Giovanna Lima");
        bigBrother.add("Giovanna Pitel");
        bigBrother.add("Isabelle Nogueira");
        bigBrother.add("Juninho");
        bigBrother.add("Leidy Elin");
        bigBrother.add("Lucas Henrique");
        bigBrother.add("Lucas Luigi");
        bigBrother.add("Lucas Pizane");
        bigBrother.add("Marcus Vinicius");
        bigBrother.add("Matteus Amaral");
        bigBrother.add("Maycon Cosmer");
        bigBrother.add("MC Bin Laden");
        bigBrother.add("Michel Nogueira");
        bigBrother.add("Nizam");
        bigBrother.add("Raquele Cardozo");
        bigBrother.add("Rodriguinho");
        bigBrother.add("Thalyta Alves");
        bigBrother.add("Vanessa Lopes");
        bigBrother.add("Vinicius Rodrigueus");
        bigBrother.add("Wanessa Camargo");
        bigBrother.add("Yasmin Brunet");

        for (String nome : bigBrother) {
            System.out.println(nome);
        }
    }
}

