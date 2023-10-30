package aula11heranca;

public class Bolsista extends Aluno {
	
	//atributos
	private float bolsa;
	
	//metodos especiais
	public float getBolsa() {
		return bolsa;
	}

	public void setBolsa(float bolsa) {
		this.bolsa = bolsa;
	}

	//outros metodos
	@Override
	public void pagarMensalidade() {
		System.out.println("Aluno Bolsista, pagando mensalidade...");
	}
	
	public void renovarBolsa() {
		System.out.println("Matricula de bolsista renovado!");
	}
	
	
}
