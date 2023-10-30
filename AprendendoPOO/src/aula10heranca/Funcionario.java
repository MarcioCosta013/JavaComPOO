package aula10heranca;

public class Funcionario extends Pessoa {
	
	//atributos
	private String setor;
	private boolean trabalhando;
	
	//metodos especiais
	public String getSetor() {
		return setor;
	}
	public void setSetor(String setor) {
		this.setor = setor;
	}
	public boolean getTrabalhando() {
		return trabalhando;
	}
	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}
	
	//outros metodos
	public void mudarTrabalho() {
		
		this.trabalhando = !this.trabalhando;
		
		/*if (this.trabalhando == true) { // é a mesma coisa...
			this.trabalhando = false;
		} else {
			this.trabalhando = true;
		}*/
	}
	
}
