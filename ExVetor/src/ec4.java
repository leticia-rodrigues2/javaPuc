import java.util.Scanner;

public class ec4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		double vetorA[] =new double [15]; 
		 
		 
		
		 double vetorB[] = vetorA; 
		 for (int i=0; i<vetorA.length; i++) {
			 System.out.println("Digite o valor");
			 vetorA[i]=entrada.nextDouble();
			
		 }
		 vetorA[14]= 4;
	
				
		
		 
		 
			// mostra todos os valores
			for(double vec: vetorB) {
		System.out.println(Math.sqrt(vec));
				
			}
	}

}
