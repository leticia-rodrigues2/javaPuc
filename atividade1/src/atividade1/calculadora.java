package atividade1;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) 
    {

 

        Scanner entrada= new Scanner (System.in);
        
        float num1, num2, resp = 0;
        char oper, continuar;
        
        do {
        System.out.println("DIGITE O  VALOR");
        num1 = entrada.nextFloat(); 
        System.out.println("DIGITE A OPERAÇÃO QUE DESEJA REALIZAR");
        System.out.println("(-) Subtração (+) Soma (/) Divisão (*) Multiplicação");
        oper = entrada.next().charAt(0);
        System.out.println("DIGITE O  VALOR");
        num2 = entrada.nextFloat();
        System.out.println("DESEJA DIGITAR MAIS VALORES? (S) - Sim | (N) - Não");
        continuar = entrada.next().charAt(0);
        
        
       
        
            if( (num1 == 0) && (num2 == 0))
            {
                System.out.println("ERRO"); 
            }
            else if  (oper ==  '+') 
            {
            	resp= num1+num2;
             
            }
            else if (oper ==  '-') 
            {
            	 resp= num1-num2;
              
            }
            else if (oper ==  '/') 
            {
                if((num1 == 0)|| (num2 == 0))
                {
                    System.out.println("ERRO");
                   
                }
                
                else
                {  resp= num1/num2;
                   
                }
                
            }
            else if (oper ==  '*') 
            {  resp= num1*num2;
            
               
            }
           
            else 
            {
                System.out.println("****ERRO****");
            }
            
        } while(continuar == 's' || continuar == 's'); 
        
        //guarda o valor da oper anterior
        resp = resp + resp;
        System.out.println("O RESULTADO É :" +resp);
        entrada.close();
}

}