/*
* Faça um Programa que converta
*  metros para centímetros.
 * */

package com.company;

import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner conversor =new Scanner(System.in);
        int metros;

        System.out.println("informe quantos metros ");
        metros = conversor.nextInt();
        int centimetros = metros*100;
        System.out.println(metros + "metros é igual a " + centimetros + " centimetros");
    }
}
