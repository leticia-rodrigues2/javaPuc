import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double vetorA[] =new double [10]; 
		double vetorB[] =new double [vetorA.length]; 
		 

				

		 for (int i=0; i<vetorA.length; i++) {
			 System.out.println("Digite o valor");
			 vetorA[i]=entrada.nextDouble();
			 
			 
			 // COMANDO PARA OS VALORES SER SEREM "IGUAIS'
			 vetorB[i]= vetorA[i]%2;
			
		 } 
		 /*for (int i=0; i<vetorA.length; i++) {
			 System.out.println("Digite o valor");
			 vetorB[i]=entrada.nextDouble();
			
		 }*/
		 
		 
		 
		 
		//mostra todos os valores
		 System.out.print("VETOR A : ");
			for(double vec1: vetorA) {
		System.out.print(" "+vec1+ " - ");
				
			}
			System.out.println();
		 
			System.out.print("VETOR B : ");
			// mostra todos os valores
			for(double vec: vetorB) {
		System.out.print(" "+vec+ " - ");
			}
		entrada.close();	
			
			}
}
