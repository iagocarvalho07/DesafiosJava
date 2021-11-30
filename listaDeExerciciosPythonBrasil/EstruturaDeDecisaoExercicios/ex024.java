/*As Organizações Tabajara resolveram dar um aumento de
salário aos seus colaboradores e lhe contraram para desenvolver
o programa que calculará os reajustes. • Faça um programa que
recebe o salário de um colaborador e o reajuste segundo o
seguinte critério, baseado no salário atual:
• salários até R$ 280,00 (incluindo) : aumento de 20%
• salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
• salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
• salários de R$ 1500,00 em diante : aumento de 5% Após
o aumento ser realizado, informe na tela:
• o salário antes do reajuste; • o percentual de aumento aplicado;
• o valor do aumento; • o novo salário, após o aumento*/
package EstruturaDeDecisaoExercicios;

import java.util.Scanner;

public class ex024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("salario do empregado: R$");
        double salario = scanner.nextDouble();

        double porcentagem = 0;

        if (salario <=280){
            porcentagem = 20;
        }else if (salario < 700){
            porcentagem =15;
        }else if (salario <1500){
            porcentagem = 10;
        }else if (salario >=1500){
            porcentagem = 5;
        }

        double novaSalario = salario*((porcentagem/100)+1);
        double valorAdicionado = novaSalario - salario;

        System.out.println("o salario do empregado era " + salario);
        System.out.println("o aumento no salario foi de " + valorAdicionado);
        System.out.println("o novo salario do empregado é " + novaSalario);
    }

}
