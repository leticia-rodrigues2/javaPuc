public class CifradorCesar {

	public static void main(String[] args) {
		String entrada;
		
		entrada = MyIO.readLine();
		
		while (!entrada.equals("FIM")) {
		String mensagemCifrada = cifrarMensagem(entrada);
		System.out.println(mensagemCifrada);
		entrada = MyIO.readLine();
		}
	}
      

	private static String cifrarMensagem(String entrada) {
		String tabela = "";
  		 int chave = 3;
  	        char x ,y;
   
		for (int i = 0; i < entrada.length(); i++) 
        {
			
	        
			if (entrada.charAt(i) >= 97 && entrada.charAt(i) <= 122)
        	{
				if ((int)(entrada.charAt(i) + chave) > 122)
        		{
        		 x = (char) (entrada.charAt(i) + 122);
        		 y = (char) (x-122);
        		tabela += (char)(96+y);
        	
        		}
				else 
        		{
        		tabela += (char) (entrada.charAt(i)+ chave);
        		
        		}
        	
        	}  
        
        
        if (entrada.charAt(i)>= 65 && entrada.charAt(i)<=90)
        {
        	if (entrada.charAt(i)+ chave > 90)		
        	{
        		  x = (char) (entrada.charAt(i) + chave);
                  y = (char) (x - 90);
                  tabela += (char) (64 + y);
                  
             } 
        	else 
             {
                  tabela += (char) (entrada.charAt(i) + chave);
             
                  
              }
        	
        }
      }
        
       
		return tabela;
	}


	}
		
	    
	
