package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {
		
		
		
		int[] idades = new int[5]; // Inicia sempre com 0
		
//		// Atribuindo valores manualmente.
//		idades[0] = 19;
//		idades[1] = 29;
//		idades[2] = 39;
//		idades[3] = 49;
//		idades[4] = 59;
//		
//		// Imprimindo a o que tem no index 4 do Array
//		int idade4 = idades[4];
//		System.out.println(idade4);
		
		// Iterando em um Array
		for (int i = 0; i < idades.length; i++) {
			idades [i] = i + i;
		}
		
		for (int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}
		
		// Imprimindo o tamanho do Array
		
		System.out.println("Tamanho do seu Array é "+ idades.length);
	}

}
