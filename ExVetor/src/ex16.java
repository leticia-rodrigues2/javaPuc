import java.util.Scanner;

public class ex16 {

	public static void main(String[] args) {
		int SomMenor =0;
		int somaMaior = 0;
		Scanner entrada = new Scanner (System.in);
		
		double media = 0;

		double[] vetorA = new double[10];

		for (int i = 0; i < vetorA.length; i++) {
			System.out.print("digite um valor :");
			vetorA[i] = entrada.nextDouble();
		}
	

		for (int i = 0; i < vetorA.length; i++) {
			if (vetorA[i] <15) {
				SomMenor = (int) (vetorA[i] +SomMenor);
				

			}
		}
		
			int igual = 0;

			for (int i = 0; i < vetorA.length; i++) {
				if (vetorA[i]  == 15) {
					igual++;

				}
			}
			
			
			
			for (int i = 0; i < vetorA.length; i++) {
				if (vetorA[i] >15) {
					somaMaior = (int) (vetorA[i] +somaMaior);
					

				}
			}
			
				int igualMaior = 0;

				for (int i = 0; i < vetorA.length; i++) {
					if (vetorA[i] > 15) {
						igualMaior++;

					}
				}
				System.out.println(igualMaior);
				System.out.println(" a SOMA dos elementos sãoa menore que 15 é : "+SomMenor);
				System.out.println("Quantidade de elementos com numero IGUAL a 15: " + igual);
				System.out.println("MEDIA de elemento superior a 15: " + (somaMaior/igualMaior));
			
			
	}

}
