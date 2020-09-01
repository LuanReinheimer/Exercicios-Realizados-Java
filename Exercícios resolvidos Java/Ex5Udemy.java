package course;

import java.util.Locale;
import java.util.Scanner;

public class Ex5Udemy {

	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual P/N da peça:");
		int peça1 = sc.nextInt();
		
		System.out.print("Quantidade de peças comprada:");
		int quantidade = sc.nextInt();
		
		System.out.print("Qual P/N de Carcaça:");
		int peça2 = sc.nextInt();
		
		System.out.print("Quantidade de carcaça comprada:");
		int quantidade2 = sc.nextInt();
		
		double preço = 5.30;
		double preço2 = 5.10;
		
		double total =  preço * quantidade + preço2 * quantidade2;
				
		
		System.out.printf("Valor a Pagar: R$:%.2f%n",+ total);		
				
				
				
	
		sc.close();
	}

}
