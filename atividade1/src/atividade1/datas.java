package atividade1;

import java.util.Scanner;

public class datas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia, mes, ano;
		int jane =31, fev = 28 , mar =31, abr=30,mai=31,jun=30,jul=31, agos=31,set =30, out=31, nov =30, dez=31;
		
			
	System.out.print("Digite o dia: ");
		dia = entrada.nextInt();
		System.out.print("Digite o mês: ");
		mes = entrada.nextInt();
		System.out.print("Digite o ano: ");
		ano = entrada.nextInt();
		/* VERIFICAÇÃO DE DATA VÁLIDA */
		if(mes > 12)
		{
		System.out.println("Data inválida - mês inexistente");
		}
		else if(dia > 31)
		{
		System.out.println("Data inválida - dia inexistente");
		}
		/* VERIFICAÇÃO DE ANO BISSEXTO */
		if(ano % 400 == 0)
		{
		System.out.println("O ano é bissexto");
		 }
		else if(ano % 4 == 0 && ano % 100 != 0)
		{
		 System.out.println("O ano é bissexto");
		 }
		else
		{
		 System.out.println("O ano não é bissexto");
		 }
		if (mes==01){
			System.out.println(dia);
			
		}
		 else if(mes ==02) {
			System.out.println("quantidade de dias é " + (jane+dia));
			
		}
		
		 else if(mes ==03) {
				System.out.println("quantidade de dias é " + (jane+fev+dia));
				
			}
		 else if(mes ==04) {
				System.out.println("quantidade de dias é " + (jane+fev+mar+dia));
				
			}
		 else if(mes ==05) {
				System.out.println("quantidade de dias é " + (jane+fev+mar+abr+dia));
				
			}
		 else if(mes ==06) {
				System.out.println("quantidade de dias é " + (jane+fev+mar+abr+mai+dia));
				
			}
		 else if(mes ==07) {
				System.out.println("quantidade de dias é " + (jane+fev+mar+abr+mai+jun+dia));
				
			}
		else if((mes == 8 || mes ==8)) {
				System.out.println("quantidade de dias é " + (jane+fev+mar+abr+mai+abr+jun+jul+dia));
				
			}
		 else if (mes ==9) {
		 System.out.println("quantidade de dias é " + (jane+fev+mar+abr+mai+abr+jun+jul+agos+dia));
			 
			 
		 }
		 else if(mes == 10) {
			 System.out.println("quantidade de dias é " + (jane+fev+mar+abr+mai+abr+jun+jul+agos+set+dia));
			 
		 }
		 else if (mes == 11) {
			 System.out.println("quantidade de dias é " + (jane+fev+mar+abr+mai+abr+jun+jul+agos+set+out+dia));
		 }
		 else if (mes == 12) { System.out.println("quantidade de dias é " + (jane+fev+mar+abr+mai+abr+jun+jul+agos+set+out+nov+dia));}
	
	
		/* IMPRIMIR DATA EM FORMATO EUROPEU */
		System.out.printf("Data em formato europeu: %d/%d/%d%n",
		dia, mes, ano);
		/* IMPRIMIR DATA EM FORMATO AMERICANO */
		System.out.printf("Data em formato americano: %d/%d/%d",
		mes, dia, ano);
		entrada.close();
		
		}
		}
		

