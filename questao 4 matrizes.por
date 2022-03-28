programa
{ 
	
	funcao inicio()
	{
		/*4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
		e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
		ou seja, diagonal principal.*/

      inteiro tabuleiro[3][3], somatabu=0, somadiagonal=0, coluna, linha 


     para(coluna=0;coluna<3;coluna++)
     {
       para(linha=0;linha<3;linha++)
       {
     
           
     	 escreva("\nDigite o valor:")
     	 leia(tabuleiro[linha][coluna])

     	 somatabu+= tabuleiro[linha][coluna]
     	
     		
     	}
     }

         escreva("\nSoma total do tabuleiro:", somatabu)

          para(coluna=0;coluna<3;coluna++)
          	{ 
                para(linha=0;linha<3;linha++) 
                {
          	
          		se(linha==coluna) 
          		 {

          		somadiagonal+= tabuleiro[linha][coluna]
          		
          	     }
          	}
          }

          	     
           escreva("\nSoma total da 1° Diaginal:",somadiagonal)
       

          

          
          
          

          






   
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1066; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {tabuleiro, 10, 14, 9}-{somatabu, 10, 31, 8}-{somadiagonal, 10, 43, 12};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */