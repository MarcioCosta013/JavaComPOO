package aula12polimorfismo.sobreposicao;

public class Ave extends Animal {
	//atributos
	private String corDaPena;

	//metodos especiais
	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}

	//outros metodos
	@Override
	public void locomover() {
		// TODO Auto-generated method stub
		System.out.println("Voando..");
	}

	@Override
	public void alimentar() {
		// TODO Auto-generated method stub
		System.out.println("Ave: Comendo Fruta");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println("Som de ave...");
	}
	
	public void fazerNinho() {
		System.out.println("Fazerdo Ninho");
	}
	
	
}
