package aula05pratica;

public class aula05PraticaBanco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111);
		p1.setDono("Marcio Costa");
		
		p1.abrirConta("cc");
		p1.depositar(100);
		
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222);
		p2.setDono("Zulamy da Costa");
		
		//p2.abrirConta("cp");
		//p2.depositar(500);
		//p2.sacar(1000);
		
		p1.sacar(150);
		p1.fecharConta();
		
		p1.estadoAtual();
		//p2.estadoAtual();
		
	}

}
