import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double vetorA[] =new double [10]; 
		double vetorB[] =new double [vetorA.length]; 
		double vetorC[]= new double [vetorB.length];
		

				
 // comando para digitar os valores
		 for (int i=0; i<vetorA.length; i++) {
			 System.out.print(" Digite o valor: ");
			 vetorA[i]=entrada.nextDouble();
			 
			 
			 // COMANDO PARA OS VALORES SER SEREM "IGUAIS'
			 vetorB[i]= vetorA[i] ;
			 vetorC[i]= (vetorA[i]+vetorB[i]);
			
		 } 
		 /*for (int i=0; i<vetorA.length; i++) {
			 System.out.println("Digite o valor");
			 vetorB[i]=entrada.nextDouble();
			
		 }*/
		 
		 
		 
		 
		//mostra todos os valores de A
		 System.out.print("VETOR A : ");
			for(double vecA: vetorA) {
		System.out.print(" "+vecA+ " - ");
				
			}
			System.out.println();
		 
			System.out.print("VETOR B : ");
			// mostra todos os valores de B
			for(double vecB: vetorB) {
		System.out.print(" "+vecB+ " - ");
			}
			System.out.println();
			
			System.out.print("VETOR C: ");
			
			// mostra todos os valores de C
			for(double vecC: vetorC) {
		System.out.print(" "+vecC+ " - ");
			}
			
		entrada.close();	
			
			}

	}