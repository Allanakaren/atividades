package helloword;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		int anos , meses, dias, idade_dias;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("\nEscreva a sua idade em dias:");
		idade_dias = leia.nextInt();
		
		anos = idade_dias / 365;
		meses= (idade_dias % 365) / 30;
		dias = (idade_dias % 365) % 30;
		
		System.out.println("\nVocê tem, anos" +anos+ "meses" +meses+ "dias" +dias);
		
		
		
		
	}

}
