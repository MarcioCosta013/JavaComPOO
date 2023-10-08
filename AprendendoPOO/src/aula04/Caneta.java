package aula04;

public class Caneta {
	
	//atributos
	private String modelo;
	private String cor;
	private float ponta;
	protected int carga;
	private boolean tampada;
	
	//Construtor
	public Caneta(String c) {
		this.tampar();
		this.setCor(c);
	}
	
	//Getters e Setters de cada atributo
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	

	public float getPonta() {
		return ponta;
	}
	public void setPonta(float ponta) {
		this.ponta = ponta;
	}
	
	
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	

	public boolean isTampada() {
		return tampada;
	}
	public void setTampada(boolean tampada) {
		this.tampada = tampada;
	}
	

	//metodos adicionais
	public void status() {
		System.out.println("Modelo: "+ this.modelo);
		System.out.println("Cor: "+ this.cor);
		System.out.println("Ponta: "+ this.ponta);
		System.out.println("Carga: "+ this.carga);
		System.out.println("Esta tampada? "+ this.tampada);
	}
	
	public void rabiscar() {
		if (this.tampada == true) {
			
			System.out.println("ERRO: A caneta está tampada!");
			
		} else {
			
			System.out.println("Estou Rabiscando");
		}
		
	} 
	
	protected void tampar() {
		this.tampada = true;
	}
	
	protected void destampar() {
		this.tampada = false;
	}

}
