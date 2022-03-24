programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()
	{
		/*1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário
de seu trabalho. Toda vez que ele traz um peso de tomate maior que o estabelecido pelo
regulamento do estado de São Paulo (50 quilos) deve pagar um multa de R$ 4,00 por quilo
excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor
da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo
ZERO.*/


      real p, E, m 

      escreva("\nInforme o peso:")
      leia(p)

      E= 0.00
      m= 0.00

      se (p > 50.00)  { 
      	
          E= p - 50
          m= E * 4.00 

           escreva("O PESO PASOU DE 50KG!\nExcesso de ", mat.arredondar(E,2), "kg.\nDeverá pagar R$", mat.arredondar(m,2), 
           "de multa")
           
      }

      

      senao {
            E = 0.0
            m = 0.0
          
         escreva("O PESSO ESTÁ CORRETO!\nExcesso de ", mat.arredondar(E,2), "kg.\nMulta de r$", mat.arredondar(m,2))
      	
      }
     
      

 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 735; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */