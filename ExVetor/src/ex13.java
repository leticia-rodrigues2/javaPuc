import java.util.Scanner;

public class ex13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		//CRIANDO O VETOR
			double[] vetorA = new double[10];

			for(int i =0 ; i <vetorA.length; i++) {
				System.out.print("digite um valor :");
			vetorA[i]= entrada.nextDouble();
			}
			int qntdPar=0;
			
			for (int i =0 ; i<vetorA.length; i++)
			{
				if(vetorA[i] % 5== 0) {
					qntdPar ++;
					
				}
		
			}
			
			System.out.println();
			 System.out.print("VETOR A : ");
				for(double vec1: vetorA) {
			System.out.print(" "+vec1+ " - ");
					System.out.println();
					
					
					
				}
				System.out.println("A quantidade de pares são: " + qntdPar);
			entrada.close();
		

	}

}
