package helloword;

import java.util.Scanner;

public class Exerciciodowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, somamult3=0, contamult3=0;
		float  media;
		Scanner leia= new Scanner(System.in);
		
		do
		{
			System.out.println("\nDigite o número: ");
			num = leia.nextInt();
			
			if(num==0)
			{
				System.out.println("\nVocê digitou zero, vamos finalizar o programa!!!");
			}
			
			else
			{
				if(num%3==0)
				{
					somamult3 += num;
					contamult3++;
				}
			}
		}
		
		while(num!=0);
		media = somamult3 / contamult3;
		System.out.printf("\nSoma dos números múltiplos de 3: %6.2f", media);
		
		
		
		
		
		
	}

}
