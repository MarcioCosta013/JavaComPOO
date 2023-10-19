package aula07e08relacionamentoentreclasses;

import java.util.Random;

public class Luta {
	
	//atributos
	private int rounds;
	private boolean aprovada;
	private Lutador desafiado;
	private Lutador desafiante;
	
	//metódos especiais
	public int getRounds() {
		return rounds;
	}
	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	public boolean isAprovada() {
		return aprovada;
	}
	public void setAprovada(boolean aprovada) {
		this.aprovada = aprovada;
	}
	public Lutador getDesafiado() {
		return desafiado;
	}
	public void setDesafiado(Lutador desafiado) {
		this.desafiado = desafiado;
	}
	public Lutador getDesafiante() {
		return desafiante;
	}
	public void setDesafiante(Lutador desafiante) {
		this.desafiante = desafiante;
	}
	
	//metodos publicos
	public void marcarLuta(Lutador l1, Lutador l2 ) {
		if(l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2) ) {
			
			this.setAprovada(true);
			this.setDesafiado(l1);
			this.setDesafiante(l2);
			
		} else {
			this.setAprovada(false);
			this.setDesafiado(null);
			this.setDesafiante(null);
		}
	}
	
	public void lutar() {
		
		if(this.isAprovada() == true) {
			
			desafiado.apresentar();
			System.out.println("------------------------------------");
			desafiante.apresentar();
			
			Random resultado = new Random();
			int luta = resultado.nextInt(3); //0 1 2
			
			switch (luta){
			
				case 0: //Para empate
					System.out.println("Resultado:------------------- Empate! --------------------");
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1: //desafiado vence
					System.out.println("Resultado: ------ Vitoria de: " + this.desafiado.getNome());
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2: //desafiante vence
					System.out.println("Resultado: ----------------------Vitória de: " + this.desafiante.getNome());
					this.desafiado.perderLuta();
					this.desafiante.ganharLuta();
					break;
			}
		} else {
			System.out.println("A luta não pode acontecer!");
		}
		
	}

}
