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
		Prigui�a animal3 = new Prigui�a("Marilene","5 meses","alta-frequ�ncia","subir em �rvores");
	    animal3.imprimirPrigui�a();
		
		
		
		
	}

}
