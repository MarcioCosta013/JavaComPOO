package aula12polimorfismo.sobreposicao;

public class Reptil extends Animal{
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
		System.out.println("Rastejando...");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Comendo folhas...");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de Reptil");
	}
	
	
}
