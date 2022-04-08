package POO;

public class Priguiça extends Animal{

	private String subiremarvores;
	
	public Priguiça (String nome, String idade, String som, String subiremarvores)
	{
		super(nome,idade,som);
		this.subiremarvores = subiremarvores;
	}

	public String getSubiremarvores() {
		return subiremarvores;
	}

	public void setSubiremarvores(String subiremarvores) {
		this.subiremarvores = subiremarvores;
	}
	
	public void imprimirPriguiça()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nAbilidade de: "+subiremarvores);
	}
	
	
}
