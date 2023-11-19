package aula14pratica;

public class Video implements AcoesVideo{
	
	
	//atributos
	private String titulo;
	private int avaliacao;
	private int views;
	private int curtidas;
	private boolean reproduzindo;
	
	//construtor
	public Video(String titulo) {
		
		this.titulo = titulo;
		this.avaliacao = 1;
		this.curtidas = 0;
		this.reproduzindo = false;
		this.views = 0;
	}

	//metodos da interface
	@Override
	public void play() {
		reproduzindo = true;
	}
	
	@Override
	public void pause() {
		reproduzindo = false;
	}
	
	@Override
	public void like() {
		curtidas++;
	}
	
	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacao=" + avaliacao + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzindo=" + reproduzindo + "]";
	}

	//metodos especiais...
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao + avaliacao)/this.views);
		this.avaliacao = nova;
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
