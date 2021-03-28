import java.util.Scanner;

public class ex22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double vetorA[] =new double [10]; 
	int qtd0=0;
	int qtd1;
		
		for(int i= 0; i<vetorA.length; i++)
		{
			vetorA[i]=(int)Math.round(Math.random()*1);
		}
		entrada.close();
		
	}

}
