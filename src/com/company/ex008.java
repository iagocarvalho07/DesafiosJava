/*Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 Calcule e mostre o total do seu salário no referido mês.
* */

package com.company;

import java.util.Scanner;

public class ex008 {
    public static void main(String[] args) {
        Scanner TotalSalario = new Scanner(System.in);
        int dinheiroPorHora, horasPorMes;

        System.out.println("quanto voce ganha por hora");
        dinheiroPorHora =TotalSalario.nextInt();

        System.out.println("quantas horas voce trabalha por mes ");
        horasPorMes =TotalSalario.nextInt();

        int ganhoDoMes = dinheiroPorHora*horasPorMes;
        System.out.println(ganhoDoMes);
    }
}
