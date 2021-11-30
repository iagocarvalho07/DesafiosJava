/*
* Faça um Programa que leia três números
*  e mostre-os em ordem decrescente.*/
package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex022 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("entre com o primeiro numero: ");
        int number1 = scan.nextInt();

        System.out.print("segundo: ");
        int number2 = scan.nextInt();

        System.out.print("terceiro numero: ");
        int number3 = scan.nextInt();

        //number1 (menor) number3 (maior)
        if (number1 < number2 && number1 < number3 &&       number2 < number3) {
            System.out.println(number3 + " - " + number2 + " - " + number1);
            //number1 (maior) number3 (menor)
        } else if (number1 > number2 && number1 >                  number3 && number2 > number3) {
            System.out.println(number1 + " - " + number2 + " - " + number3);
            //number2 (maior) number1(maior)
        } else if (number2 < number3 && number2 <                  number1 && number1 > number3) {
            System.out.println(number1 + " - " + number3 + " - " + number2);
            //number2 (maior) number1(menor)
        } else if (number2 > number3 && number2 >                  number1 && number1 < number3) {
            System.out.println(number2 + " - " + number3 + " - " + number1);
            //number2(maior) number3(menor)
        } else if (number2 > number3 && number2 >                  number1 && number3 < number1) {
            System.out.println(number2 + " - " + number1 + " - " + number3);
            //number3(maior) number2(menpr)
        } else if (number3 > number2 && number3 >                  number1 && number2 < number1) {
            System.out.println(number3 + " - " + number1 + " - " + number2);
        }
    }
}
