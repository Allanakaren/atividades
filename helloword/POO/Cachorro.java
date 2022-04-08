package POO;

public class Cachorro extends Animal{

	private String corre;
	
	public Cachorro (String nome, String idade, String som, String corre)
	{
		super(nome,idade,som);
		this.corre = corre;
		
	}

	public String getCorre() {
		return corre;
	}

	public void setCorre(String corre) {
		this.corre = corre;
	}
	
	public void imprimeCachorro()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nAbilidade de Correr: "+corre);
		
	}
	
}
