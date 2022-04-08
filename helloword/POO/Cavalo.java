package POO;

public class Cavalo extends Animal{

	
	
	public Cavalo()
	{
		super("Tipo Animal: Cavalo");
		
	}

	 @Override 
	 public void nome(String nomeAnimal)
	 {
		 System.out.println("\nNome do seu Cavalo: "+nomeAnimal);
	 }
	 
	 @Override
	 public void idade(String idadeAnimal)
	 {
		 System.out.println("\nQual a idade do seu Cavalo: "+idadeAnimal);
	 }
	 
	 @Override
	 public void som(String somAnimal)
	 {
		 System.out.println("\nQual somo seu Cavalo faz? "+somAnimal);
	 }
	
	
}
