package br.com.bytebank.banco.teste;

public class TesteString {

	public static void main(String[] args) {
		
		 
		
		String nome = "Alura"; // object literal
		String vazio = " ";
		String testandoTrimm = "  alura  ";
		
		// Retorna se um String esta vazio ou nao.
		System.out.println(vazio.isEmpty());
		
		// Remove todos os espaços vazio de uma string.
		System.out.println(testandoTrimm);
		System.out.println(testandoTrimm.trim());
		
		// Retorna o index da palavra desejada.
		int pos = nome.indexOf("ur");
		System.out.println(pos);
		
		// Retorna a letra na posicao(index) desejada(letra).
		char c = nome.charAt(0);
		System.out.println(c);
		
		// Retorna o tamanho da Sting desejada.
		int tamanho = nome.length();
		System.out.println(tamanho);
		
		// Retorna uma string que é uma substring dessa string. Substring começa com o caractere no índice especificado e estende até o final dessa string.
		String sub = nome.substring(1);
		System.out.println(sub);
		
		
		// Para imprimir caractere por caracter de uma String no java usa o FOR.
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
	}
}
