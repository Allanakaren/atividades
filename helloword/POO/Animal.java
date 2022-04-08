package POO;

// criando classe abstract

public abstract class Animal {

	private String tipoAnimal;
	
	
	
	public Animal(String tipoAnimal)
	{
        this.tipoAnimal = tipoAnimal;	
	}
	
	abstract public void nome(String nomeAnimal);
	abstract public void idade(String idadeAnimal);
	abstract public void som(String somAnimal);

	public String getTipoAnimal() {
		return tipoAnimal;
	}

	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	
	
	
	
	
}
