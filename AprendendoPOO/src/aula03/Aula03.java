package aula03;

public class Aula03 {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.modelo = "Bic";
		c1.cor = "Vermelha";
		c1.carga = 80;
		//c1.ponta; -------> ponta é privada, só pode ser usada dentro da classe onde ela foi criada.
		//c1.tampada; --------> o atributo é privado só pode ser modificado por um metodo que está na classe onde ele fo criado.
		
		c1.status();
		

	}

}
