package br.com.alura;

public class TestaCursoComAluno {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Luan Reinheimer");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 22));
		javaColecoes.adiciona(new Aula("Modelando Colecoes", 24));
		javaColecoes.adiciona(new Aula("Criando Uma aula", 20));
		
		// Estancia os objetos aluno da classe alunos
		Aluno a1 = new Aluno("Rodrigo Turini", 34632);
		Aluno a2 = new Aluno("Lucas Reinheimer", 64323);
		Aluno a3 = new Aluno("Paulo", 76324);
		
		// Cria um metodo matricula eles no Arraylist de curso
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		//Imprime todos alunos matriculados no curso
		System.out.println("Todos os alunos matriculados: ");
		for (Aluno aluno : javaColecoes.getAlunos() ) {
			System.out.println("["+" Alunos: "+ aluno.getNome() + ", Matricula: " + aluno.getNumeroMatricula() + "]");
		}
		
		// Cria o metodo estamatriculado e verifica se possui este aluno matriculado no curso
		System.out.println("O aluno " + a1 + " esta matriculado?");
		System.out.println(javaColecoes.estamatriculado(a1)); // returna true ou false se possui este aluno matriculado

	}

}
