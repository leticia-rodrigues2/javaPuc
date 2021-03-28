import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double vetorA[] =new double [20]; 
		double catacao;
		
		System.out.println("Entre coma cotação do dollar : ");
		catacao=entrada.nextDouble();
		

		for(int i= 0; i<vetorA.length; i++)
		{
			vetorA[i]=catacao*i;
		}
		
	/*	System.out.println("VETOR A = ");
		for(int i=0;i <vetorA.length; i++) {
			System.out.println(vetorA[i]+ " ");
			
		}
		*/
		for(double vec1: vetorA) {
			System.out.print(" "+vec1+ " - ");
					
		
		entrada.close();
		}}

}
