package br.com.bytebank.banco.modelo;


public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) { // Construtor que vem da classe mae Conta
		super(agencia, numero);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		return "ContaPoupanca, " + super.toString();
	}
}
