package bytebank;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int totalDeContasCriadas;
	
	public Conta(Cliente titular, int agencia, int numero) {
		Conta.totalDeContasCriadas++;
		
		this.setTitular(titular);
		this.setAgencia(agencia);
		this.setNumero(numero);
		
	}
	
	

	public void deposita(double valor) {
		this.saldo =+ valor;
	}

	public boolean sacar(double valor) { 
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else { 
            return false;
        }
    }

	public boolean transfere(double valor, Conta destino){
	    if(this.saldo >= valor){
	        this.saldo -= valor;
	        destino.deposita(valor);    
	        return true;
	    }
	    return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public static int getTotalDeContasCriadas() {
		return Conta.totalDeContasCriadas;
	}

}