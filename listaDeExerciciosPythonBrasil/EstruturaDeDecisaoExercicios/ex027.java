package EstruturaDeDecisaoExercicios;
/*
* Faça um programa que lê as duas notas parciais obtidas por um aluno
*  numa disciplina ao longo de um semestre, e calcule a sua média.
* A atribuição de conceitos obedece à tabela abaixo: • Média de
* Aproveitamento Conceito Entre 9.0 e 10.0 A Entre 7.5 e 9.0 B
* Entre 6.0 e 7.5 C Entre 4.0 e 6.0 D Entre 4.0 e zero EO
* algoritmo deve mostrar na tela as notas, a média, o conceito
* correspondente e a mensagem “APROVADO” se o conceito for A, B ou C ou
* “REPROVADO” se o conceito for D ou E.*/

import java.io.IOException;
import java.util.Scanner;

public class ex027 {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        for (int i = 0; i < N; i++) {


            if ((N > 0) && (N % 2) == 0){
                System.out.println("EVEN POSITIVE");
            }
            else if ((N > 0) && (N % 2) != 0) {
                System.out.println("ODD POSITIVE");
            }
            else if ((N < 0) && (N % 2) == 0) {
                System.out.println("EVEN NEGATIVE");
            }
            else if ((N < 0) && (N % 2) != 0) {
                System.out.println("ODD NEGATIVE");
            }
            else {
                System.out.println("NULL");
            }
        }

    }
}