package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex026 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("os numeros de 1 a 7 correspondem a um dia da semana");
        int dayWeek = scan.nextInt();

        switch(dayWeek) {
            case 1: System.out.println("1-Sunday/domingo"); break;
            case 2: System.out.println("2-Monday/segunda"); break;
            case 3: System.out.println("3-Tuesday/terça"); break;
            case 4: System.out.println("4-Wenesday/quarta"); break;
            case 5: System.out.println("5-Thursday/quinta"); break;
            case 6: System.out.println("6-Friday/sexta"); break;
            case 7: System.out.println("7-Saturday/Sabado"); break;
            default: System.out.println("Invalid Number/numero invalido"); break;
        }
    }
}
