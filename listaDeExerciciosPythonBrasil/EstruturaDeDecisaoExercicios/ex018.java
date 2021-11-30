/*
Faça um programa para a leitura de duas notas parciais de um aluno.
 O programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual
a sete; • A mensagem "Reprovado", se a média for menor
do que sete; • A mensagem "Aprovado com Distinção",
se a média for igual a dez.
 */

package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex018 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("digite a nota do primeiro teste");
        int test1 = scanner.nextInt();

        System.out.println("digite a nota do segundo teste");
        int test2 = scanner.nextInt();

        int media = (test1+test2)/2;

        if (media == 10 ){
            System.out.println("sua media é " + media + "voce foi aprovado é aluno exemplar" );
        }else if (media >= 7){
            System.out.println("sua media é " + media + " esta aprovado");
        }else {
            System.out.println("Sua media é " +media + " Reprovado");
        }
    }
}
