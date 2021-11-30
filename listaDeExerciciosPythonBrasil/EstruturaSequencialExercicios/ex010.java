/*
Faça um Programa que peça a temperatura em
 graus Celsius,
transforme e mostre em graus Fahrenheit.
*/
package EstruturaSequencialExercicios;

import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {
        Scanner conversosTemperatura =new Scanner(System.in);
        float celsius, fharenheit;

        System.out.println("digite a temperatura em celsius para saber seu equivalente em fahrenheit");
        System.out.println("temperatura em celsius");
        celsius =conversosTemperatura.nextInt();
        fharenheit = (celsius*9/5) +32;
        System.out.println(celsius + " graus celsius equivale a " + fharenheit + " graus fharenheit");
    }
}
