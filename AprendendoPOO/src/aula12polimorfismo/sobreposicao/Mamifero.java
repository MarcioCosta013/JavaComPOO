package aula12polimorfismo.sobreposicao;

public class Mamifero extends Animal {
	
	private String corDoPelo;

	//metodos especiais
	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	//outros metodos
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Andando ...");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Mamando...");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de Mamifero...");
	}
	
}
