package aula10heranca;

public class Aluno extends Pessoa {
	
	//atributos
	private int matri;
	private String curso;
	
	//metodos especiais
	public int getMatri() {
		return matri;
	}
	public void setMatri(int matri) {
		this.matri = matri;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	//outros metodos
	public void cancelarMatri() {
		System.out.println("A metricula será cancelada!...");
	}
}
