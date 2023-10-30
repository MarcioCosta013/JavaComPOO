package aula10heranca;

public class Professor extends Pessoa {

	//atributos
	private String especialidade;
	private float salario;
	
	//metodos especiais
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	
	//outros metodos
	public void receberAum(float aum) {
		this.salario += aum;
	}
}
