package aula12polimorfismo.sobreposicao;

public class Canguru extends Mamifero {
	
	//outros metodos
	public void usarBolsa() {
		System.out.println("Usando Bolsa...");
	}

	@Override
	public void locomover() {
		System.out.println("Pulando...");
	}
	
	
	
}
