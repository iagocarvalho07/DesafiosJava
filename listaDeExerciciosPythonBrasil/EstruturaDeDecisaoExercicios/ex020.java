/*
* Faça um Programa que
* leia três números e mostre
*  o maior e o menor deles.*/


package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex020 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("digite o primeiro Numero: ");
        int number1 = scan.nextInt();

        System.out.print("digite o segundo Numero: ");
        int number2 = scan.nextInt();

        System.out.print("digite o terceiro Numero: ");
        int number3 = scan.nextInt();

        if (number1 >= number2 && number1 >= number3) {
            System.out.println("o primeiro numero " + number1 + " é o maior");
        } else if (number2 >= number1 && number2 >= number3) {
            System.out.println("To segundo numero " + number2 + " é o maior");
        } else if (number3 >= number1 && number3 >= number2) {
            System.out.println("o terceiro numero " + number3 + " é o maior");
        }

        if (number1 <= number2 && number1 <= number3){
            System.out.println("o primerio numero"+ number1 + "e o menor");
        }else if (number2 <= number1 && number2 <= number3){
            System.out.println("o segundo numero " + number2 + "e o menor");
        }else if (number3 <= number1 && number3 <= number2){
            System.out.println("o terceiro numero " + number3 + "é o menor");
        }
    }
}
