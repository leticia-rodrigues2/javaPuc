import java.util.Scanner;

public class ex12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//CRIANDO O VETOR
				double[] vetorA = new double[10];

				int total=0;
		for(int i =0 ; i <vetorA.length; i++) {
			System.out.print("digite um valor :");
		vetorA[i]= entrada.nextDouble();
		
		total=(int) (total + vetorA[i]);
		}
		
		
	
		
		System.out.println();
		 System.out.print("VETOR A : ");
			for(double vec1: vetorA) {
		System.out.print(" "+vec1+ " - ");
				System.out.println();
				
				
				
			}
			System.out.println("A soma de todos os valores é  " + total);
		entrada.close();
		
		
	}

}
