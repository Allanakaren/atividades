package POO;

public class Cachorro extends Animal{

	
	
	public Cachorro()
	{
		super("Tipo Animal: Cachorro" );
		
	}
	
	 @Override 
	 public void nome(String nomeAnimal)
	 {
		 System.out.println("\nNome do seu doguinho: "+nomeAnimal);
	 }
	 
	 @Override
	 public void idade(String idadeAnimal)
	 {
		 System.out.println("\nQual a idade do seu doguinho: "+idadeAnimal);
	 }
	 
	 @Override
	 public void som(String somAnimal)
	 {
		 System.out.println("\nQual somo seu doguinho faz? "+somAnimal);
	 }
	 
	
	
	
}
