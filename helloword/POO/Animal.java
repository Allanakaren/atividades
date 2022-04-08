package POO;

public class Animal {

	private String nome;
	private String idade;
	private String som;
	
	
	public Animal(String nome, String idade, String som) 
	{
		super();
        this.nome = nome;
		this.idade = idade;
		this.som = som;
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	
	
}
