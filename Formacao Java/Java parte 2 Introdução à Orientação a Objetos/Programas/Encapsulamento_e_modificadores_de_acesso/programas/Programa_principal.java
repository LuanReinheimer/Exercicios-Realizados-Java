package programas;

import classes.Cliente;
import classes.Conta;

public class Programa_principal {

	public static void main(String[] args) {
		
		Cliente Joao = new Cliente ("João da Silva", "Rua da paz, 45");
		Cliente Maria = new Cliente ("Maria da Silva", "Rua das copas, 55");
		
		
		Conta conta_joao = new Conta(943, 100.0f, 200.0f, Joao );
		Conta conta_Maria = new Conta(332, 300.0f, 400.0f, Maria );
		
		System.out.println("Saldo do Joao(Antes do saque): " + conta_joao.getSaldo());
		System.out.println("Saldo do Maria: " + conta_Maria.getSaldo());
		
		conta_joao.sacar(100.0f);
		
		System.out.println("Saldo do Joao(Depois do saque): " + conta_joao.getSaldo());
		System.out.println("O Titular da conta "+ conta_joao.getNumero() + " é " + conta_joao.getCliente().getNome());
	}

	
}
