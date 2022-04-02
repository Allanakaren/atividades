package helloword;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia, mes, ano,total;
		
	    Scanner leia = new Scanner( System.in );
	 
		System.out.println("\nEscreva o dia em que você nasceu: ");
		dia = leia.nextInt();
				
	    System.out.println("\nEscreva o mes em que você nasceu: ");
		mes = leia.nextInt();
		
		System.out.println("\nEscreva o ano em que você nasceu: ");
		ano = leia.nextInt();
		
		total = (ano*360) + (mes*30) + dia;
		System.out.println("você tem" +total+ "dias de vida ");
				
			
		
		
		
		
		
	}

}
