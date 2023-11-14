package aula13polimofismo.sobrecarga;

public class Mamifero extends Animal{
	
	protected String corDoPelo;

	@Override
	public void emitirSom() {
		
		System.out.println("Som de Mamifero...");
	}
	
}
