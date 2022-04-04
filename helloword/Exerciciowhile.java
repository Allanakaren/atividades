package helloword;

import java.util.Scanner;

public class Exerciciowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int idade=0, idademaior=0, idademenor=0;
		
		
		Scanner leia = new Scanner(System.in);
		
		
		while(idade!=-99)
		{
	    	System.out.println("\nDigite sua idade:");
			idade = leia.nextInt();
			
			if(idade<21 && idade>=0 )
			{
				idademenor++;
			}
			else if (idade>50)
			{
				idademaior++;
			}
	    	
	   }

		System.out.println("\nSoma das pessoas menores de 21 anos: " +idademenor);
		System.out.println("\nSoma das pessoas maiores de 50 anos: " +idademaior);
		
	}

}
