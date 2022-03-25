programa
{
	
	funcao inicio()
	{
		real num, numSoma = 0.0, numMedia 	// numMedia (numSoma / numcontagem)
	inteiro numContagem	= 0

	escreva("\nInsira um número: ")
	leia(num)

	se (num<0)
	{
		escreva("ATENÇÃO: ENTRADA INVÁLIDA!")
	}

	senao
	{
	enquanto (num>0)
	{
		numSoma += num // numSoma = num + numSoma
		numContagem++ // x = x + 1
		escreva("\nInsira um número: ")
		leia (num) 
				
	}
	numMedia = numSoma / numContagem

	escreva("\nTotal soma: ", numSoma)
	escreva("\nTotal Contagem ", numContagem, ".")
	escreva("\nMédia dos números inseridos: ", numMedia)

	}	
	
	
}
	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 582; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */