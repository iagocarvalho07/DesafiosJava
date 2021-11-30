/*
Faça um Programa que verifique se uma letra digitada
 é "F" ou "M". Conforme a letra escrever:
 F - Feminino, M - Masculino, Sexo Inválido.
* */


package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex016 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entre com a letra [F/M");
        String letra = scan.next();

        if (letra.equalsIgnoreCase("f")) {
            System.out.println("F - Feminino");
        }else if (letra.equalsIgnoreCase("m")){
            System.out.println("M - Homen");
        }else {
            System.out.println("invalido");
        }
    }
}