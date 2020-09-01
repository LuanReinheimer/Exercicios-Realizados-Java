package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.*;


public class TesteTributaveis {

	public static void main(String[] args) {
		//Full Qualified Name FQN
		ContaCorrente cc = new ContaCorrente(222, 333);
		cc.deposita(100.0);
		
		
		SeguroDeVida seguro = new SeguroDeVida();
		
		CalucadorDeImposto calc = new CalucadorDeImposto();
		calc.registra(cc);
		calc.registra(seguro);
		
		System.out.println(calc.getTotalImposto());

	}

}
