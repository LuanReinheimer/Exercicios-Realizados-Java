package course;

import java.util.Locale;
import java.util.Scanner;

public class Ex5Udemy {

	public static void main(String [] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual P/N da pe�a:");
		int pe�a1 = sc.nextInt();
		
		System.out.print("Quantidade de pe�as comprada:");
		int quantidade = sc.nextInt();
		
		System.out.print("Qual P/N de Carca�a:");
		int pe�a2 = sc.nextInt();
		
		System.out.print("Quantidade de carca�a comprada:");
		int quantidade2 = sc.nextInt();
		
		double pre�o = 5.30;
		double pre�o2 = 5.10;
		
		double total =  pre�o * quantidade + pre�o2 * quantidade2;
				
		
		System.out.printf("Valor a Pagar: R$:%.2f%n",+ total);		
				
				
				
	
		sc.close();
	}

}
