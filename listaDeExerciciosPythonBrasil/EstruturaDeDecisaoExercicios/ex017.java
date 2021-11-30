/*Faça um Programa que verifique se uma
 letra digitada é vogal ou consoante.*/

package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite uma letra para saber se é uma vogal ou consoante");
        String letra = scanner.next();

        if (letra.length()>1){
            System.out.println("entre com apenas uma letra");
        }else {
            switch (letra){
                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                case "A":
                case "E":
                case "I":
                case "O":
                case "U":
                    System.out.println("a letra " + letra + "é uma vogal");
                default:System.out.println("a letra " + letra + " é uma consoante");
            }
        }
    }
}
