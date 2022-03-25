programa
{
	
	funcao inicio()
	{
		inteiro numero, somarpar=0, quantimpar=0

		escreva("\nDigite o numero:")
		leia(numero)

		enquanto(numero!=0)
		{
			se(numero % 2==0) { somarpar= somarpar+numero }
			senao { quantimpar++ }

			escreva("Digite o numero:")
			leia(numero)                  }

			escreva("\nSoma dos pares:", somarpar)
			escreva("\nSoma dos impares:", quantimpar)
			
		    
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 392; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */