import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	int total =0;
	//CRIANDO O VETOR
		double[] vetorA = new double[10];

		for(int i =0 ; i <vetorA.length; i++) {
			System.out.print("digite um valor :");
		vetorA[i]= entrada.nextDouble();
		}
		int qntdPar=0;
		
		for (int i =0 ; i<vetorA.length; i++)
		{
			if(vetorA[i] % 5 == 0) {
				
				total=(int) (total + vetorA[i]);
			}
			
		}
		
		System.out.println();
		 System.out.print("VETOR A : ");
			for(double vec1: vetorA) {
		System.out.print(" "+vec1+ " - ");
				System.out.println();
				
				
				
			}
			System.out.println("A soma " + total);
		entrada.close();
	}

}
