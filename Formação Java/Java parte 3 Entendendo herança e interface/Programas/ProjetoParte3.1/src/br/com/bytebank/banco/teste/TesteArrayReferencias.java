package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
//		int[] idades = new int[5]; // Inicia sempre com 0

		
		// Criando a referenica para adicionar contasCorrente dentro de contas.
		Object [] referencias =  new Object[5]; // Sempre a referencia sera Null
	
		// Criando os objetos e os adicionando dentro do Array.
		
		ContaCorrente cc1 = new ContaCorrente(22, 15);
		referencias[0] = cc1;
		ContaPoupanca cc2 = new ContaPoupanca(25, 16);
		referencias[1] = cc2;
		
		
		// Imprimindo o Array de Contas.
//		System.out.println(cc1);
//		System.out.println(referencias[1].getNumero());
//		System.out.println(referencias[1].getAgencia());
//		
//		System.out.println(cc2);
//		System.out.println(referencias[0].getNumero());
//		System.out.println(referencias[0].getAgencia());
//		
	}
	

}
