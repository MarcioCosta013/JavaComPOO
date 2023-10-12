package aula07e08relacionamentoentreclasses;

public class Lutador {
	
	//atributos
	private String nome;
	private String nacionalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias;
	private int derrotas;
	private int empates;
	
	//construtor
	public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso); //aqui é usado o 'set' para que possa alterar a categoria sempre que mudar o peso, como programado no setPeso que chama setCategoria.
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}
	
	//metodos especiais.
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getNacionalidade() {
		return nacionalidade;
	}



	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public float getAltura() {
		return altura;
	}



	public void setAltura(float altura) {
		this.altura = altura;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria();
	}



	public String getCategoria() {
		return categoria;
	}



	private void setCategoria() {
		if (peso<52.2) {
			this.categoria = "Peso Invalido!";
		} else if(peso <= 70.3) {
			this.categoria = "Leve";
		} else if(peso <= 83.9) {
			this.categoria = "Médio";
		} else if(peso <= 120.2) {
			this.categoria = "Pesado";
		} else {
			this.categoria = "Peso Invalido! Mamute...";
		}
		
	}



	public int getVitorias() {
		return vitorias;
	}



	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}



	public int getDerrotas() {
		return derrotas;
	}



	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}



	public int getEmpates() {
		return empates;
	}



	public void setEmpates(int empates) {
		this.empates = empates;
	}


	//Metodos
	public void apresentar() {
		System.out.println("Lutador: " + this.getNome());
		System.out.println("Origem: " + this.getNacionalidade());
		System.out.println(this.getIdade() + " Anos");
		System.out.println(this.getAltura() + "m de Altura");
		System.out.println("Pesando " + this.getPeso() + "Kg");
		System.out.println("Ganhou: " + this.getVitorias());
		System.out.println("Perdeu: " + this.getDerrotas());
		System.out.println("Empatou: " + this.getEmpates());
	}
	

	public void status() {
		System.out.println(this.getNome());
		System.out.println("é um peso " + this.getCategoria());
		System.out.println(this.getVitorias() + " Vitorias");
		System.out.println(this.getDerrotas() + " Derrotas");
		System.out.println(this.getEmpates() + " Empates");
	}
	
	public void ganharLuta() {
		
		this.setVitorias(this.getVitorias() + 1);
	}
	
	public void perderLuta() {
		
		this.setDerrotas(getDerrotas() + 1);
	}
	
	public void empatarLuta() {
		
		this.setEmpates(this.getEmpates() + 1);
	}
	
}
