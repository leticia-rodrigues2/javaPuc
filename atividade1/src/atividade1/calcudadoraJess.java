package atividade1;

import java.util.Scanner;

public class calcudadoraJess {

	public static void main(String[] args) {
		{
			 Scanner entrada = new Scanner (System.in);

	 float num1, num2;
		char operacao, continuar;

			 do
			 {
			 System.out.print("Digite o 1º valor: ");
			 num1 = entrada.nextFloat();
			 System.out.print("Digite a operação desejada sendo (-) Subtração (+) Soma "+ "(/) Divisão (*) Multiplicação: ");
			 operacao = entrada.next().charAt(0);
			 System.out.print("Digite o 2º valor: ");
			 num2 = entrada.nextFloat();
			 System.out.print("Deseja digitar outros valores? (S) Sim | (N)Não: ");
			 continuar = entrada.next().charAt(0);

			 if( (num1 == 0.0) && (num2 == 0.0))
			 {
			 System.out.println("\n Erro: Os dois valores não podem ser iguais a 0! - Fim do programa");
			 }
			 else if (operacao == '+')
			 {
			 System.out.printf("\nO resultado da soma é: %.2f%n", (num1 +
			num2));
			 }
			 else if (operacao == '-')
			 {
			 System.out.printf("\nO resultado da subtração é: %.2f%n", (num1 -
			num2));
			 }
			 else if (operacao == '/')
			 {
			 if((num1 == 0.0)|| (num2 == 0.0))
			 {
			 System.out.println("\nErro: Divisão por 0 inválida!");
			 }
			 else
			 {
			 System.out.printf("\nO resultado da divisão é: %.2f%n" ,
			(num1 / num2));
			 }
			 }
			 else if (operacao == '*')
			 {
			 System.out.printf("\nO resultado da multiplicação é: %.2f%n",
			(num1 * num2));
			 }
			 else
			 {
			 System.out.println("\nErro: Operação inválida!");
			 }
			 }
			 while(continuar == 'S' || continuar == 's' && num1 != 0.0 || num2 !=
			0.0);

			 entrada.close();
			 }
			 }
}