import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
double vetorA[] =new double [5]; 
double vetorB[] =new double [5]; 
 

		

 for (int i=0; i<vetorA.length; i++) {
	 System.out.println("Digite o valor");
	 vetorA[i]=entrada.nextDouble();
	 
	 vetorB[i]= vetorA[i];
	
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
