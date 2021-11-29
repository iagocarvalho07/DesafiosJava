/*
*Faça um Programa que peça o raio de um círculo,
* calcule e mostre sua área.
* */

package com.company;
import java.util.Scanner;

public class ex006 {
    public static void main(String[] args) {
        Scanner digaOraio = new Scanner(System.in);
        int raio;

        System.out.println("digite o raio da circunferencia para saber sua Area");
        raio = digaOraio.nextInt();

        int circunferencia = (int) (3.14 * (raio*raio));
        System.out.println(circunferencia);
    }
}
