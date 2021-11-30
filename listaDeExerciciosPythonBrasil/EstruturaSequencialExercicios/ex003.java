/*Faça um Programa que peça dois
números e imprima a soma*/

package EstruturaSequencialExercicios;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner numero1 =new Scanner(System.in);
        System.out.println("digite primeiro numero");
        Scanner numero2 =new Scanner(System.in);
        System.out.println("digite segundo numero");
        int soma = numero1.nextInt()+numero2.nextInt();
        System.out.println("a soma é " + soma);
    }
}
