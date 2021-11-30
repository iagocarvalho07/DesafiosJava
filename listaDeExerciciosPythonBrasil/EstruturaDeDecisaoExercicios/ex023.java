/*Faça um Programa que pergunte em que turno você estuda. Peça para digitar M-matutino ou V-Vespertino ou NNoturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!"
ou "Boa Noite!" ou "Valor Inválido!", conforme o caso.*/
package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex023 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();

        System.out.println("M - Morning/manha | A - Afternoon/ a tarde | N - Night/ a noite");

        System.out.print("Wich shift do you study?/ em que horario vc estuda ");
        String shift = scanner.next();

        if (shift.length() > 1) {
            System.out.println("Entre com apenas uma letra");
        } else {
            switch(shift) {
                case "M":
                case "m": System.out.println("Good Morning!/ bom dia"); break;
                case "A":
                case "a": System.out.println("Good Afternoon! / boa tarde"); break;
                case "N":
                case "n": System.out.println("Good Evening!/ boa noite"); break;
                default: System.out.println("Invalid Value! /valor invalido");
            }
        }
    }
}
