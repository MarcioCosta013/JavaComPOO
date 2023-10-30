package aula11heranca;

public class Professor extends Pessoa {
	//atributos
	private String especialidade;
	private float salario;
	
	//metodos ewspeciais
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
	public void receberAumento(float aum) {
		this.salario += aum;
	}
}
