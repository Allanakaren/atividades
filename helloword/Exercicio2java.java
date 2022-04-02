package helloword;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 int a, b, c;
	       
	       Scanner leia = new Scanner(System.in);
	       
	       System.out.println("\nDigite o 1° número: ");
	       a = leia.nextInt();
	       
	       System.out.println("\nDigite o 2° número: ");
	       b = leia.nextInt();
	    		   
	       System.out.println("\nDigite o 3° número: ");
	       c = leia.nextInt();
	    		   
	       if(a<=b && b<=c)
	       {  System.out.println("\nOrdem crescente: "+a+", "+b+", "+c); }
	       
	       else if(a<=c && c<=b) 
	       {  System.out.println("\nOrdem crescente: "+a+", "+c+","+b); }
	       
	       else if(b<=a && a<=c) 
	       { System.out.println("\nOrdem crescente: "+b+", "+a+", "+c); }
	       
	       else if(b<=c && c<=a)
	       {  System.out.println("\nOrdem crescente: "+b+", "+c+", "+a); }
	       
	       else if(c<=b && a<=b) 
	       { System.out.println("\nordem crescente: "+c+", "+a+", "+b); }
			
	       else { System.out.println("\nOrdem crescente: "+c+", "+b+", "+a); }           
	       
	
	}
			}


