/*
   Faça um Programa que peça um valor e mostre na tela
    se o valor é positivo ou negativo.
* */

package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com o primeiro numero");
        int num1 =scan.nextInt();

        System.out.println("entre com o segundo numero");
        int num2 = scan.nextInt();

        if (num1 > num2){
            System.out.println("o " + num1 + "é o maior");
        }else if (num1 == num2){
            System.out.println("os numero " + num1 +" o  numero " + num2 + "são iguais");

        }else {
            System.out.println("o numero "+num2 + " é o maior");
        }
    }
}
