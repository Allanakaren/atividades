programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		/*3) Desenvolva um sistema em que:
•Leia 4 (quatro) números;
•Calcule o quadrado de cada um;
•Se o valor resultante do quadrado do terceiro for >= 1000, imprima-o e finalize;
•Caso contrário, imprima os valores lidos e seus respectivos quadrados. */

      real n1, n2, n3, n4, q1, q2, q3, q4


      escreva("\nDigite o primeiro numero: ")
      leia(n1)
      
      escreva("\nDigite o segundo numero: ")
      leia(n2)
      
      escreva("\nDigite o terceiro numero: ")
      leia(n3)
      
      escreva("\nDigite o quarto numero: ")
      leia(n4)

      q1= mat.potencia(n1,2.0)
      q2= mat.potencia(n2,2.0)
      q3= mat.potencia(n3,2.0)
      q4= mat.potencia(n4,2.0)
      

      se(q3>=1000) { escreva("\nO quadrado do terceiro:",q3)}
      
      

      senao
      {       escreva("\nValor do primeiro:",n1, "seu Quadrado:")
              escreva("\nValor do segundo:",n2, "seu Quadrado:")
              escreva("\nValor do terceiro:",n3, "seu Quadrado:")
              escreva("\nValor do quarto:",n4, "seu Quadrado:")
              
              }
      
      
      
      

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 831; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */