package br.com.alura.maven;

public class produto {

	private final String nome;
	private final double preco;
	
	public produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	 
	
}
