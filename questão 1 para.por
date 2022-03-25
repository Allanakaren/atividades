programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		real salario, mediaSalario, somaSalario=0.0, mediaFilhos, maiorSalario=0.0, percSalario=0.0, cont100 = 0.0, somaFilhos=0.0
	inteiro filhos, x
	
	para(x=1; x<=3; x++) //x++ = x + 1 //(inicio; ''fim''; x++), o ";" é da função
	{
		escreva("\nEntre com o ",x, "º salario: ")
		leia(salario)
		escreva("\nEntre com o número de filhos do habitante ",x,":")
		leia(filhos)	

		somaSalario += salario //+ somaSalario
		somaFilhos += filhos		
				
		se (salario>maiorSalario) // 1000, 900, 
			{maiorSalario = salario}

		se (salario<=100) //percentual de pessoas que recebem até 100 reais 
			{cont100++}
			//    (num pessoas) 3    - 100% (total de pessoas)
			// 	 (cont100) 	1 	-  x	  (percentual)  	=> 3x = 100 => x = 100/3 =>  
		
	}

		mediaSalario = somaSalario / 3
		mediaFilhos = somaFilhos / 3 
		percSalario = (cont100 * 100) / 3 // porcentagem de pessoas que recebem menos que 100 reais
		
		escreva("\nA média dos salários da população é: ", mat.arredondar(mediaSalario,2))
		escreva("\nA média de filhes é: ", mat.arredondar(mediaFilhos,2))
		escreva("\nO maior salário da população é: ", maiorSalario)
		escreva("\nO percentual de pessoas que recebem menos que 100 reais é: ", mat.arredondar(percSalario,3))
		
	


	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 51; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */