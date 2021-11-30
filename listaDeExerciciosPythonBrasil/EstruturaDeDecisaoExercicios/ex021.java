/*Faça um programa que pergunte o preço de três produtos e informe qual produto você deve comprar,
 sabendo que a decisão é sempre pelo mais barato.*/
package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex021 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o preço do primeiro produto R$");
        double produto1 = scanner.nextDouble();

        System.out.println("qual o preço do segundo produto R$");
        double produto2 = scanner.nextDouble();

        System.out.println("qual o preço do terceiro produto R$");
        double produto3 = scanner.nextDouble();

        if (produto1 <= produto2 && produto1 <= produto3) {
            System.out.println("o primeiro produto é mais barato");
        }else if (produto2 <=produto1 && produto2 <= produto3);{
            System.out.println("o segundo produto e mais barato ");

        }else if(produto3 <= produto1 && produto3 <= produto2 ){
            System.out.println("o terceiro produto é mais barato");
        }


    }
}
