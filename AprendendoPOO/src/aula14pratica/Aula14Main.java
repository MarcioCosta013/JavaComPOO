package aula14pratica;

public class Aula14Main {

	public static void main(String[] args) {
		
		Video v[] = new Video[3];
		v[0] = new Video("Aula de Java");
		v[1] = new Video("Aula de POO em Java");
		v[2] = new Video("Aula de PHP");
		
		Aluno a[] = new Aluno[2];
		a[0] = new Aluno("Jubileu", 22, "M", "juju");
		a[1] = new Aluno("Zulamy", 23, "F", "zuzu");
		
		Visualizacao vis = new Visualizacao(a[0], v[0]);
		System.out.println(vis.toString());

	}

}
