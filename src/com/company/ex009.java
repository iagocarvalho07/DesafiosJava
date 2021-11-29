/*
Faça um Programa que peça a temperatura
 em graus Fahrenheit, transforme e mostre
  a temperatura em graus Celsius.
C = 5 * ((F-32) / 9)
* */

package com.company;

import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {
        Scanner conversosTemperatura =new Scanner(System.in);
        float celsius, fharenheit;

        System.out.println("digite a temperatura em fahrenheit para saber seu equivalente em celsius");
        System.out.println("temperatura em fahrenheit");
        fharenheit =conversosTemperatura.nextInt();
        celsius= 5* ((fharenheit-32)/9);
        System.out.println(fharenheit + " graus fahrenheit equivale a " + celsius + " graus celsius");
    }
}
