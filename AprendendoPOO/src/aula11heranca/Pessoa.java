package aula11heranca;

public abstract class Pessoa {
	//atributos
	private String nome;
	private int idade;
	private String sexo;
	
	//metodos especiais
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	//outros metodos
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}
	
	public void fazerAniver() {
		this.idade++;
	}
	
	

}
