package Exercicio15;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {
    //perguntar quanto você ganha por hora
    Scanner sc = new Scanner(System.in);
    System.out.println("quanto vc ganha por hora: ");
    double valorHora = sc.nextDouble();
    //perguntar o número de horas trabalhadas no mês
    System.out.println("Quantas horas você trabalhou no mês: ");
    double qtdHoras = sc.nextDouble();
    //Calcular salario bruto
    double salarioBruto = valorHora * qtdHoras;
    //Calcular 8% para o INSS
    double INSS = salarioBruto * 0.08;
    //Calcular o desconto pago ao sindicato
    double sindicato = salarioBruto * 0.05;
    //calcule o imposto de Renda
    double IRRF = salarioBruto * 0.11;
    //calcule o total dos descontos
    double totalDescontos = INSS + sindicato + IRRF;
    //Calcule o salário líquido.    
    double salarioLiquido = salarioBruto - totalDescontos;

    System.out.println("+ Salário Bruto: R$ " + salarioBruto);
    System.out.println("- IR (11%): R$ " + IRRF);
    System.out.println("- INSS (8%): R$ " + INSS);
    System.out.println("- Sindicato (5%): R$ " + sindicato);
    //= Salário liquido : R$
    System.out.println("= Salário Líquido: R$ " + salarioLiquido);
    sc.close();
    }
}