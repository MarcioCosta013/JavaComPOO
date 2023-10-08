package aula04;

//AULA SOBRE METODOS GETTERS E SETTERS E CONSTRUTOR.

public class Aula04 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta("Azul"); //Construtor passando um parametro.
		c1.status();
		
		System.out.println("-----------------------------------------------");
		System.out.println("O Modelo é: " + c1.getModelo());
		System.out.println("-----------------------------------------------");
		
		c1.setModelo("BIC");
		System.out.println("O Modelo é: " + c1.getModelo());
		

	}

}
