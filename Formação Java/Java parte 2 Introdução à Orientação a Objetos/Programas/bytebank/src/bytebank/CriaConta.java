package bytebank;

public class CriaConta {

	public static void main(String[] args) {
			
			// Objetos cliente e conta
			Cliente paulo = new Cliente ("Paulo da Silva", "933.222.222-34", "Programador", "Rua das Copas");
	        Conta contaDoPaulo = new Conta(paulo, 943, 8004);
	        contaDoPaulo.deposita(100);
	        System.out.println("Conta possui R$" + contaDoPaulo.getSaldo());
	        System.out.println("O titular desta conta é "+ contaDoPaulo.getTitular().getNome());
	        System.out.println("O total de contas criadas é de " + Conta.getTotalDeContasCriadas());
	        
	  
	    }
	}