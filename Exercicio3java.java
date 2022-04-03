package revisao;

import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int horas, minutos, segundo1, segundo2; 
	    Scanner leia = new Scanner (System.in);
	    
	    System.out.println("\nEscreva a duração do seu evento:");
	    segundo1 = leia.nextInt();
	    
	    horas = segundo1 % 3600;
	    minutos = (segundo1 % 3600) / 60;
	    segundo2 = (segundo1 - horas*3600) - minutos*60;
	    
	    System.out.println("\nA duração do evento foi:  horas" +horas+ "minutos" +minutos+ "segundo2" +segundo2 );
	    
		
		
		
		
		
		
	}

}
