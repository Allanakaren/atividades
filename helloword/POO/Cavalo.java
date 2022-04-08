package POO;

public class Cavalo extends Animal{

	private String crina;
	
	public Cavalo(String nome, String idade, String som, String crina)
	{
		super(nome,idade,som);
		this.crina = crina;
	}

	public String getCrina() {
		return crina;
	}

	public void setCrina(String crina) {
		this.crina = crina;
	}
	
	public void imprimeCavalo()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nAbilidade de Correr: "+crina);
	}
	
	
	
	
	
}
