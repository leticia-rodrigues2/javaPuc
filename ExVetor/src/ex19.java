import java.util.Scanner;

public class ex19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double notas1[] =new double [10]; 
		double notas2[] =new double [notas1.length]; 
		double result[] =new double [notas1.length]; 
		
		for (int i=0; i<notas1.length; i++) {
			 System.out.print("Digite a a nota do aluno no primeiro semestre ");
			 notas1[i]=entrada.nextDouble();
			 
			
		 } 
		
		for (int i=0; i<notas1.length; i++) {
			 System.out.print("Digite a a nota do aluno no segundo semestre semestre ");
			 notas2[i]=entrada.nextDouble();
			 
			 result[i] = (notas1[i] + notas2[i]) / 2;
		 } 
		
		System.out.print("RESULTADO A : ");
		for(double vec1: result) {
	System.out.print(" "+vec1+ " - ");
			System.out.println();
			
			
			
		}
		
		for (int i=0; i<notas1.length; i++) {
			 ;
			 if (notas2[i]>7) {
				 System.out.println("Aluno "+ (i+1)+" ***** APROVADO ****");
			 }
			 else {
				 System.out.println("Aluno "+( i+1)+"  ****REPROVADO****");
			 }
			 
		 } 
		
		
		
		
	}

}
