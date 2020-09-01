package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {

		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Luan Reinheimer");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Trabalhando com LinkedList", 22));
		javaColecoes.adiciona(new Aula("Modelando Colecoes", 24));
		javaColecoes.adiciona(new Aula("Criando Uma aula", 20));

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		Collections.sort(aulas);
		System.out.println(aulas);

		System.out.println("O tempo total de aulas é de " + javaColecoes.getTempoTotal() + " horas");
		System.out.println(javaColecoes);
	}

}
