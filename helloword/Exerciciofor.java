package helloword;

import java.util.Scanner;

public class Exerciciofor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, x, contimpar = 0, contpar= 0;
		Scanner leia = new Scanner(System.in);
	    
		
        
		 for( x=1; x<=10; x++)
		 {
			 
			 System.out.println("\nDigite o n�mero:");
	         num = leia.nextInt();
	        
	         
	         if(num %2==0)
	         {
				contpar++;
	         }	
	         
	         else
	         {
	        	 contimpar++;
	        		 
	         }
	         
		 }
		 
		 System.out.println("\nQuantidade de n�meros pares:" +contpar);
		 System.out.println("\nQuantidade den�mero impar: "+contimpar);
	         
	}

}
