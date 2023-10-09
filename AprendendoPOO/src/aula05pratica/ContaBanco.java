package aula05pratica;

public class ContaBanco {
	
	//atributos.
	public int numConta;
	protected String tipo;
	private String dono;
	private Float saldo;
	private Boolean status;
	
	//construtor.
	public ContaBanco(){
		Float s = 0f;
		this.setSaldo(s);
		this.setStatus(false);
	}

	
	//metodos especiais (getters e setters).
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if(tipo == "cc" || tipo == "cp") {
			this.tipo = tipo;
		} else {
			System.out.println("Erro, digite 'CC' para Conta Corrente ou 'CP' para Conta Poupança... ");
		}
		
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Float getSaldo() {
		return saldo;
	}

	public void setSaldo(Float saldo) {
		this.saldo = saldo;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	//metodos adicionais.
	public void estadoAtual() {
		System.out.println("------------------------------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo da conta: " + this.getTipo());
		System.out.println("Nomo do Propietário: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status da Conta: " + this.getStatus());
	}
	public void abrirConta(String tipoP) {
		
		this.setStatus(true);
		this.setTipo(tipoP);
		if (tipo == "cc") {
			System.out.println("Conta Aberta com sucesso!");
			this.saldo = 50.00f;
		} else {
			if(tipo == "cp") {
				System.out.println("Conta Aberta com sucesso!");
				this.saldo = 150.00f;
			} else {
				System.out.println("Erro: Digite ou 'cc' ou 'cp'!");
			}
			
		}
		
	}
	
	public void fecharConta() {
		if(this.saldo > 0f) {
			System.out.println("Erro: Para Fechar a conta é preciso Sacar o saldo disponivel primeiro!");
		} else {
			if(this.saldo < 0f) {
				System.out.println("Erro: VErificamos que ainda há pendencias referentes a sua conta a serem pagas!");
			} else {
				status = false;
				System.out.println("Conta fechada com sucesso!");
			}
			
		}
	}
	
	public void depositar(float depo ){
		if(this.status == true) {
			saldo = saldo+depo;
			System.out.println("Deposito realizado com Sucesso!");
			System.out.println("Saldo atual da conta é:" + this.saldo);
		} else {
			System.out.println("ERRO: A conta se encontra fechada!");
		}
	}
	
	public void sacar(float sacarp) {
		if(this.status == true) {
			if(this.saldo >= sacarp) {
				saldo = saldo-sacarp;
				System.out.println("Operação realizada com sucesso!");
				System.out.println("Seu saldo atual é: " + this.getSaldo());
			} else {
				System.out.println("Saldo Insuficiente para sacar!");
			}
		} else {
			System.out.println("Erro: Essa conta foi fechada!");
		}
	}
	
	public void pagarMensal() {
		if(tipo=="cc") {
			this.saldo = saldo-12.00f;
			
		} else {
			this.saldo = saldo-20.00f;
		}
	}

}
