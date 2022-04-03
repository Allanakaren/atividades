package revisao;

import java.util.Scanner;

public class Revisao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float nota1, nota2, nota3, med;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua primeira nota:");
		nota1 = leia.nextInt();
		System.out.println("\nDigite sua segunda nota:");
		nota2 = leia.nextInt();
		System.out.println("\nDigite sua terceira nota:");
		nota3 = leia.nextInt();
		
		med = (nota1+nota2+nota3) / 3;
		
		System.out.println("\nSua média foi: " +med);
		
		
		
		
	}

}
