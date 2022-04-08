package POO;

public class AnimalGeral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n\t***Sobre os Animais***");
		Cachorro animal1 = new Cachorro("slink","2 anos","latido","corre");
	    animal1.imprimeCachorro();
	    
	    System.out.println("\n\t*************************************");
		Cavalo animal2 = new Cavalo("Balanoalvo","5 anos","relinchar","corre");
	    animal2.imprimeCavalo();
	    
	    System.out.println("\n\t*************************************");
		Priguiça animal3 = new Priguiça("Marilene","5 meses","alta-frequência","subir em árvores");
	    animal3.imprimirPriguiça();
		
		
		
		
	}

}
