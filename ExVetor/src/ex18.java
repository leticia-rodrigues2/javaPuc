import java.util.Scanner;

public class ex18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double idades[] =new double [10]; 
	 
		 int idadaMaior =0;

				

		 for (int i=0; i<idades.length; i++) {
			 System.out.println("Digite a idade ");
			 idades[i]=entrada.nextDouble();
			 
			
		 } 
		 
		 for (int i=0; i<idades.length; i++) {
			if (idades[i]>35) {
				idadaMaior++;
			}
			 
			
		 } 
		 System.out.println("A quantidade de pessoas que possuem mais de 35 anos é : " + idadaMaior);
		 
		 
		 

	}

}
