package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.*;

public class TestesContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP "+ cp.getSaldo());
		
		cc.transfere(10, cp);
		
		System.out.println("Depois da transferencia");
		System.out.println("CC " + cc.getSaldo());
		System.out.println("CP "+ cp.getSaldo());
		
		ContaEspecial ce = new ContaEspecial(123, 666);
		ce.deposita(200.0);
		
		System.out.println("CE " + ce.getSaldo());

		
		

	}

}
