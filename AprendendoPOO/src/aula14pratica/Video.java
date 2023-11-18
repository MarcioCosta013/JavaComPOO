package aula14pratica;

public class Video implements AcoesVideo{
	
	
	//atributos
	private String titulo;
	private String avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	//metodos da interface
	public void play() {
		
	}
	
	public void pause() {
		
	}
	
	public void like() {
		
	}
	
	//metodos especiais...
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	

}
