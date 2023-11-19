package aula14pratica;

public class Aluno extends Pessoa {

	//atributos
	private String login;
	private int totAssistido;
	
	//construtor
	public Aluno(String nome, int idade, String sexo, String login) {
		super(nome, idade, sexo);
		this.login = login;
		this.totAssistido = 0;
	}
	
	//metodos especiais
	public void viuMaisUm() {
		totAssistido++;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}

	@Override
	public String toString() {
		return "Aluno [" + super.toString() + "login=" + login + ", totAssistido=" + totAssistido + "]"; //o "super.toString" acrecenta o ToString da classe m
	}
	
	
	
}
