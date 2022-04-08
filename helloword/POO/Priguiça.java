package POO;

public class Prigui�a extends Animal{

	private String subiremarvores;
	
	public Prigui�a (String nome, String idade, String som, String subiremarvores)
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
	
	public void imprimirPrigui�a()
	{
		System.out.println("\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nSom: "+getSom()+"\nAbilidade de: "+subiremarvores);
	}
	
	
}
