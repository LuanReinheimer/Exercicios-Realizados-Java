package course;

import java.util.Locale;
import java.util.Scanner;

public class Ex3Udemy {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o nome do comprador:");
		String nome = sc.nextLine();

		System.out.print("Para o caminhão ou carreta:");
		String modelo = sc.nextLine();

		System.out.print("Qual Fornecedor:");
		String fornecedor = sc.nextLine();

		System.out.print("Quantidade comprado:");
		int quantidade = sc.nextInt();

		sc.nextLine();

		System.out.print("Qual marca do Pneu:");
		String marca = sc.nextLine();

		System.out.print("Valor unítario do pneu:");
		double valor = sc.nextDouble();

		System.out.print("Custo de troca do pneu:");
		double troca = sc.nextDouble();

		System.out.print("Custo do frete:");
		double frete = sc.nextDouble();

		double total = valor * quantidade + troca + frete;

		System.out.print("\n==========NOTA DE COMPRA==========");

		System.out.println("\nNome do comprador:" + nome);
		System.out.println("\nCaminhao ou Carreta:" + modelo);
		System.out.println("\nFornecedor escolhido:" + fornecedor);
		System.out.println("\nQuantidade:" + quantidade);
		System.out.println("\nMarca do Pneu: " + marca);
		System.out.println("\nValor unítario R$:" + valor);
		System.out.println("\nCusto de troca do Pneu é de R$:" + troca);
		System.out.println("\nCusto do frete será de R$:" + frete);
		System.out.println("\nO valor total de sua compra sera de R$:" + total);
		
		sc.close();

	}
}
