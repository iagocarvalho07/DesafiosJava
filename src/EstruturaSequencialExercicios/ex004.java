/*
* Faça um Programa que peça
* as 4 notas bimestrais e mostre a média.*/

package EstruturaSequencialExercicios;


import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        int N1, N2, N3, N4;

        System.out.println("informe a primeira nota");
        N1 = notas.nextInt();

        System.out.println("informe a segunda nota");
        N2 = notas.nextInt();

        System.out.println("digite a terceira nota");
        N3 =notas.nextInt();

        System.out.println("digite a quarta nota");
        N4 = notas.nextInt();

        int media = (N1+N2+N3+N4)/4;
        System.out.println("a media Final é " + media);

    }
}
