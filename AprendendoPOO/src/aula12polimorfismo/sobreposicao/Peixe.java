package aula12polimorfismo.sobreposicao;

public class Peixe extends Animal {
	//atributos
	private String corDaEscama;

	//metodos especiais
	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

	//outros metodos
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Peixe: comendo substancias...");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Peixa não faz som...");
	}
	
	public void soltarBolhas() {
		System.out.println("Soltando bolhas...");
	}
	
	

}
