/*
* Faça um Programa que calcule a área de um quadrado,
* em seguida mostre o dobro desta área para o usuário.*/

package EstruturaSequencialExercicios;

import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner dobroArea = new Scanner(System.in);
        int area, base, altura;

        System.out.println("para saber a area do quadrado e seu dobro");
        System.out.println("digite a base do quadrado");
        base = dobroArea.nextInt();

        System.out.println("digite a altura do quadrado");
        altura = dobroArea.nextInt();

        area = base*altura;

        System.out.println("a area do quadro é " + area + " e seu dobro é " + area*2);
    }
}
