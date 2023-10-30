package aula11heranca;

public class Aluno extends Pessoa{
	//atributos
	private int matricula;
	private String curso;
	
	//metodos especiais
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//outros metodos
	public void pagarMensalidade() {
		System.out.println("Mensalidade paga...");
	}
}
