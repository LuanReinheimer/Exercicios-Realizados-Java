package classes;

public class Conta {
	private int numero;
	private float saldo;
	private float limite;
	private Cliente cliente;
	
	public Conta(int numero, float saldo, float limite,Cliente cliente) {
		
		this.setNumero(numero);
		this.saldo = saldo;
		this.setLimite(limite);
		this.setCliente(cliente);
	}
	
	public void sacar(float valor) {
		if (valor <= this.saldo) {
			this.saldo = this.saldo - valor;
		}
		else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	public void depositar(float valor) {
		this.saldo = this.saldo + valor;
	}
		
	public float getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
		
}
