package br.com.bytebank.banco.modelo;


public class ContaCorrente extends Conta  implements Tributavel{

	
	public ContaCorrente(int agencia, int numero) { // Construtor que vem da classe mae Conta
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException { // sobre escrever o método saca da super classe conta, pois haver uma taxa cobrada sempre que sacar da conta corrente.
		double valorASacar = valor + 0.20;
		super.saca(valorASacar);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}
	
	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString() ;
	}
	
}
