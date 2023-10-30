package aula11heranca;

public class Tecnico extends Aluno {
	//atributo
	private int registroProfissional;

	//metodos especiais
	public int getRegistroProfissional() {
		return registroProfissional;
	}

	public void setRegistroProfissional(int registroProfissional) {
		this.registroProfissional = registroProfissional;
	}
	
	//outros metodos
	public void   praticar() {
		System.out.println("Praticando...");
	}
}
