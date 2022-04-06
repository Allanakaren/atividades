package POO;

public class Funcionario {

	private String nomefuncionario;
	private String salario;
	
	public Funcionario (String nomefuncionario, String salario)
	{
		this.nomefuncionario = nomefuncionario;
		this.salario = salario;
	}

	public String getNomefuncionario() {
		return nomefuncionario;
	}

	public void setNomefuncionario(String nomefuncionario) {
		this.nomefuncionario = nomefuncionario;
	}

	public String getSalario() {
		return salario;
	}

	public void setSalario(String salario) {
		this.salario = salario;
	}
	
	public void informe()
	{
		System.out.println("\nNome do Funcionario: "+nomefuncionario+"\tSeu salario: "+salario);
	}
	
	
	
	
}
