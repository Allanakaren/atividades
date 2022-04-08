package POO;

public class Priguiça extends Animal{

	
	
	public Priguiça()
	{
		super("Tipo Animal: Preguiça");
		
	}

	 @Override 
	 public void nome(String nomeAnimal)
	 {
		 System.out.println("\nNome do seu Preguiça: "+nomeAnimal);
	 }
	 
	 @Override
	 public void idade(String idadeAnimal)
	 {
		 System.out.println("\nQual a idade do seu Preguiça: "+idadeAnimal);
	 }
	 
	 @Override
	 public void som(String somAnimal)
	 {
		 System.out.println("\nQual somo sua Preguiça faz: "+somAnimal);
	 }
	
}
