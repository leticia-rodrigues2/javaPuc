import java.util.Scanner;

public class ex14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
int total=0;
double media=0;
		
			double[] vetorA = new double[10];

			for(int i =0 ; i <vetorA.length; i++) {
				System.out.print("digite um valor :");
			vetorA[i]= entrada.nextDouble();
			}
			int qntdImp=0;
			
			
			for (int i =0 ; i<vetorA.length; i++)
			{
				if(vetorA[i] % 2 != 0) {
					qntdImp ++;
					
				}
				
			}
			for (int i =0 ; i<vetorA.length; i++) {
			 if (vetorA[i] % 2 != 0) {
				total=(int) (total + vetorA[i]);
			}
			}
			
			media =(total/qntdImp);	
			System.out.println("A média é " + media);
		}
}
		
			
			
					
					
				
				

