programa
{
	
	funcao inicio()
	{
		real n1,  n2, n3, media=1.0, mediageral, somamedia=0.0

		para(inteiro x=1;x<=3;x++)
		{ 
              escreva("entre com a primeira nota do aluno",x,":")
              leia(n1)
              escreva("entre com a segunda nota do aluno",x,":")
              leia(n2)
              escreva("entre com a terceira nota do aluno",x,":")
              leia(n3) 

              media=(n1+n2+n3)/3
              somamedia= somamedia+media 

             se(media>=7 e media<=10)
             
             { escreva("\nALUNO APROVADO!!") }
             
             senao se(media>=5 e media<=7)
             
             { escreva("\nALUNO EM RECUPERAÇÃO!!") }
             
             senao
             
             { escreva("\nALUNO REPROVADO!!") }
             
             }

             mediageral= media/3
             escreva("\nmediageral:", mediageral)
             
              
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 770; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */