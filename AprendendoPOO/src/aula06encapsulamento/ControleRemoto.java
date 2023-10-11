package aula06encapsulamento;

public class ControleRemoto implements Controlador{
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//construtor
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = false;
		this.tocando = false;
	}
	
	//metodos getters e setters
	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigado() {
		return ligado;
	}

	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	
	
	//Metodos abstratos da interface...
	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		this.setLigado(true);
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
		this.setLigado(false);
	}

	@Override
	public void abrirMenu() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			System.out.println("----------Menu-------------");
			System.out.println("Está ligado? " + this.getLigado());
			System.out.println("Está tocando? " + this.getTocando());
			System.out.print("Volume: " + this.getVolume() + " ");
			for (int i = 0; i<= this.getVolume(); i+=10) {
				System.out.print("[]");
			}
		} else {
			System.out.println("Impossível Abrir o menu: Está desligado...");
		}
		
	}

	@Override
	public void fechrMenu() {
		// TODO Auto-generated method stub
		if(this.getLigado()) {
			System.out.println("Fechando o menu...");
		} else {
			System.out.println("Impossível: está desligado...");
		}
		
	}

	@Override
	public void maisVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			if (this.getLigado()) {
				this.setVolume(this.getVolume() + 5);
			}
		} else {
			System.out.println("Impossível aumentar: Está desligado...");
		}
		
		
	}

	@Override
	public void menosVolume() {
		// TODO Auto-generated method stub
		if (this.getLigado()) {
			if (this.getTocando()) {
				this.setVolume(this.getVolume() - 5);
			}
		} else {
			System.out.println("Impossível Diminuir: Está desligado...");
		}
		
	}

	@Override
	public void ligarMudo() {
		// TODO Auto-generated method stub
		if(this.getLigado() && this.getVolume()>0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		// TODO Auto-generated method stub
		if(this.getLigado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		if(this.getLigado() && !(this.getTocando())) { //Se estiver ligado e não estiver tocando = true... se tiver tocando vai negar com o "!" e o if não vai rodar...
			this.setTocando(true);
			System.out.println("Play: tocando novamente...");
		}
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		if (this.getLigado() && this.getTocando()) {
			this.setTocando(false);
		}
	}
	
	

}
