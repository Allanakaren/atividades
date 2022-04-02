package helloword;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2, n3,maior;
		
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("\nDigite o 1° número: ");
		n1 = leia.nextFloat();
		
	    System.out.println("\nDigite o 2° número:");
	    n2 = leia.nextFloat();
	    
	    System.out.println("\nDigite o 3° número:");
	    n3 = leia.nextFloat();

	    if(n1>n2 && n1>n3 ) { maior= n1; }
	    else if(n2>n1 && n2>n3) { maior=n2; }
	    else { maior=n3; }
	    
	    System.out.println("\no maior número é: "+maior);
	   
	    	
	    
	}

}
