/*Faça um Programa que peça 2 números inteiros e um número real.
 Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
o terceiro elevado ao cubo.
        */

package com.company;

import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {
        Scanner numeroscalc =new Scanner(System.in);
        int primeiroInteiro, segundoInteiro;
        double numeroReal;

        System.out.println("Digite um numero inteiro");
        primeiroInteiro = numeroscalc.nextInt();

        System.out.println("digite o segundo numero inteiro");
        segundoInteiro = numeroscalc.nextInt();

        System.out.println("digite um numero real");
        numeroReal = numeroscalc.nextInt();

        System.out.println("o produto do dobro do primeiro com metade do segundo e igual a " +((primeiroInteiro*2)+ segundoInteiro/2 ) );
        System.out.println("a soma do triplo do primeiro com o terceiro é igual a " + ((primeiroInteiro*3)+numeroReal));
        System.out.println("o terceiro elevado ao cubo é igual a " + ((numeroReal*numeroReal*numeroReal)));
    }
}
