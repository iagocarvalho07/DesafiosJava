/*
* Faça um Programa que peça um número e então mostre a
* mensagem O número informado foi [número].*/

package com.company;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner DigNum = new Scanner(System.in);
        System.out.println("digite um numero ");
        int numdigitado = DigNum.nextInt();
        System.out.println("vc digitou " + numdigitado);
    }
}
