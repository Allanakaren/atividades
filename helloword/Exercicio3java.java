package helloword;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int dia, mes, ano,total;
		
	    Scanner leia = new Scanner( System.in );
	 
		System.out.println("\nEscreva o dia em que voc� nasceu: ");
		dia = leia.nextInt();
				
	    System.out.println("\nEscreva o mes em que voc� nasceu: ");
		mes = leia.nextInt();
		
		System.out.println("\nEscreva o ano em que voc� nasceu: ");
		ano = leia.nextInt();
		
		total = (ano*360) + (mes*30) + dia;
		System.out.println("voc� tem" +total+ "dias de vida ");
				
			
		
		
		
		
		
	}

}
