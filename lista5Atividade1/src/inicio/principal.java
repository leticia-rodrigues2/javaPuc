package inicio;

import java.util.Date;
import java.util.Scanner;

import calandario.Calendario;

public class principal {

	public static void main(String[] args) {
	Scanner entrada= new Scanner (System.in);
		int resp;
	
	Calendario calendario = new Calendario();
	
	do {
	System.out.println("Data atual" +" "+ calendario.getDia() + "/" + calendario.getMes());

	System.out.println( "Ajustar data (1)");
		System.out.println("Soma dia (2)");
		System.out.println("Sair (3)");
		resp = entrada.nextInt();
		
		if (resp ==1) {
			System.out.println("qual é o dia que deseja ? ");
			int novoDia = entrada.nextInt();
			System.out.println("Qual é o  o mes que deseja mudar");
			int novoMes = entrada.nextInt();
			calendario.MudarData(novoDia, novoMes);
		}
		 else if (resp == 2) {
			calendario.AcrescentarDia();
		}
	} while (resp != 3);
	}

}
