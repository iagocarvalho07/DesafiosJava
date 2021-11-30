/*Faça um programa para o cálculo de uma folha de pagamento,
sabendo que os descontos são do Imposto de Renda, que depende
do salário bruto (conforme tabela abaixo) e 3% para o Sindicato
e que o FGTS corresponde a 11% do Salário Bruto, mas não é descontado
(é a empresa que deposita). O Salário Líquido corresponde ao
Salário Bruto menos os descontos. O programa deverá pedir ao usuário
o valor da sua hora e a quantidade de horas trabalhadas no mês.
• Desconto do IR: • Salário Bruto até 900 (inclusive) - isento
• Salário Bruto até 1500 (inclusive) - desconto de 5%
• Salário Bruto até 2500 (inclusive) - desconto de 10%
• Salário Bruto acima de 2500 - desconto de 20% Imprima na tela
as informações, dispostas conforme o exemplo abaixo.
No exemplo o valor da hora é 5 e a quantidade de hora é 220.
Salário Bruto: (5 * 220) : R$ 1100,00 (-) IR (5%) : R$ 55,00 (-) INSS ( 10%) : R$ 110,00 FGTS (11%)
: R$ 121,00 Total de descontos : R$ 165,00 Salário Liquido : R$ 935,00*/
package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex025 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();

        System.out.print("\n" + "Valor da sua hora trabalhada: R$");
        double valorHora = scan.nextDouble();
        System.out.print("Numero de horas trabalhadas no mes : ");
        double horasTrabalhas = scan.nextDouble();

        double faixaParaImposto = horasTrabalhas * valorHora;
        double IR = 0;

        if (faixaParaImposto <= 900) {
            IR = 0;
        } else if (faixaParaImposto <= 1500) {
            IR = 5;
        } else if (faixaParaImposto <= 2500) {
            IR = 10;
        } else if (faixaParaImposto > 2500) {
            IR = 20;
        }

        double INSS = 10;
        double FGTS = 11;
        double discountIR = faixaParaImposto * (IR/100);
        double discountINSS = faixaParaImposto * (INSS/100);
        double discountFGTS = faixaParaImposto * (FGTS/100);
        double totalDiscounts = faixaParaImposto + discountINSS;
        double netSalary = faixaParaImposto - totalDiscounts;

        System.out.println();
        System.out.println("salrio: " + "( " + horasTrabalhas + " * " + valorHora + " )" + " .......... R$" + faixaParaImposto);
        System.out.println("(-) IR " + "("+ IR + "%)" + " .......................... R$" + discountIR);
        System.out.println("(-) INSS " + "("+ INSS + "%)" + " ....................... R$" + discountINSS);
        System.out.println("FGTS " + "("+ FGTS + "%)" + " ........................... R$" + discountFGTS);
        System.out.println("Total discontos" + " ........................ R$" + discountFGTS);
        System.out.println("Net Salary" + " ............................. R$" + netSalary);
    }
}
