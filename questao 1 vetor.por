programa 
{
	
	funcao inicio()
	{
	/*1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

         inteiro  tabela[5], x, Mp=0 

         
         para(x=0; x<5; x++)
          {
            escreva("\nDigite sua pontuação:")
            leia(tabela[x])  
          
           se(tabela[x] > Mp) { Mp = tabela[x] }
          
          }  

          escreva("\n suas pontuações são:")
          
         para(x=0; x<5; x++) { escreva("\n", x+1, "°:" + tabela[x]) }

         escreva("\nA maior pontuação foi:", Mp) 
         

        

         

         
          

            
            

            

            

            
          








	} 
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 586; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {tabela, 9, 18, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */