import java.util.Scanner;

public class ex17 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		int idades[] =new int [10]; 
	 
		 int idadaMaior =0;

				

		 for (int i=0; i<idades.length; i++) {
			 System.out.println("Digite a idade ");
			 idades[i]=entrada.nextInt();
			 
			
		 } 
		 
	int menor = idades[0];
	int indexMenor=0;
	int maior = idades [0];
	int indexMaior =0;
	
	 for (int i=0; i<idades.length; i++) {
		 if (idades[i]>maior)
		 {
			 maior=idades[i];
			 indexMaior= i;
			 
		 }else if (idades [i]< menor) {
			 menor = idades[i];
			 indexMenor=i;
		 }	
	 }

		 for (int i=0; i<idades.length; i++) {
			System.out.println(idades[i]+" ");
			 
		 
		 }
	System.out.println();
	
		 System.out.println("Menor idade: " + menor);
		 System.out.println("Indice menor idade: " + indexMenor);
		  
		 System.out.println("Maior idade: " + maior);
		 System.out.println("Indice maior idade: " + indexMaior);
		  
		 
	}

}
