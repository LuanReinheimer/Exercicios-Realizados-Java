package br.com.bytebank.banco.util;

import java.util.LinkedList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteLinkedList {

	public static void main(String[] args) {

		LinkedList<Conta> lista = new LinkedList<Conta>(); // usase <> (generics) para identificar que esse ArrayList é apenas do tipo de Array de referencias do tipo conta.
		
		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 12);
		lista.add(cc2);
		
		
		System.out.println("Tamanho: " + lista.size()); // imprime o tamanho do arraylist
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0); // Remove um elemento do arraylist pelo index passado.
		
		System.out.println("Tamanho: " + lista.size()); // imprime o tamanho do arraylist
		
		Conta cc3 = new ContaCorrente(22, 13);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22, 14);
		lista.add(cc4);
		
		// For antigo "na raça" para iterar em um ArrayList
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("=====================================");
		
		// For mais expressivo, entregando o mesmo resultado.
		
		for (Conta Conta : lista) {
			System.out.println(Conta);
			
		}
		
	}

}
