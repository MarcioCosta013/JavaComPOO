package aula12polimorfismo.sobreposicao;

public class Aula12Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mamifero m = new Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();;
		Ave a = new Ave();
		
		m.setPeso(35.6f);
		m.setCorDoPelo("Marrom");
		m.alimentar();
		m.locomover();
		m.emitirSom();
		
		a.locomover();
		p.locomover();

	}

}
