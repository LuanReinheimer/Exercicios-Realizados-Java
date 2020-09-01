package br.com.bytebank.banco.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArraylistEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<Conta>(); // usase <> (generics) para identificar que esse ArrayList é apenas do tipo de Array de referencias do tipo conta.
		
		Conta cc = new ContaCorrente(22, 22);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);
		
		boolean existe = lista.contains(cc2); // Verifica se no Arraylist ja possui o que deseja, returnado um true or false.
		System.out.println("Ja existe? " + existe);
				
		
		boolean ehigual = cc.equals(cc2);
		System.out.println("É igual? " + ehigual);
		
		
		
		// For mais expressivo, entregando o mesmo resultado.
		
		for (Conta Conta : lista) {
			System.out.println(Conta);
			
		}
		
	}

}
