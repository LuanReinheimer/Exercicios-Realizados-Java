package br.com.alura.maven;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		
		 produto produt = new produto("Bala juquinha sabor tangerina", 0.15);
		
		
		System.out.println("A bala que eu gosto �: "+ produt.getNome() + "e custa R$ " + produt.getPreco());
	}
}
