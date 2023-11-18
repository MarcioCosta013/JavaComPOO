package aula14pratica;

public class Aluno extends Pessoa {
	
	//atributos
	private String login;
	private int totAssistido;
	
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
	
	
}
