/*Resolvi mudar o exercicio numero 8 pois e mais comum
saber quantas horas trabalha no mes e seu salario final

desta forma faça um programa que apartir das horas trabalhadas no mes e seu salario
calcule quanto essa pessoa ganha por hora */

package EstruturaSequencialExercicios;

import java.util.Scanner;

public class ex008versao2 {
    public static void main(String[] args) {
        Scanner ganhoMes = new Scanner(System.in);
        float horasPorMes, salarioMensal;

        System.out.println("Quantas horas voce trabalha por mes");
        horasPorMes = ganhoMes.nextInt();

        System.out.println("qual seu salario mensal");
        salarioMensal = ganhoMes.nextInt();

        float salarioPorhora = salarioMensal/horasPorMes;

        System.out.println("seu ganho por hora de trabalho é " + salarioPorhora + " reais");
    }
}
