package livroDeitel;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a;
		int b;
		int resultado;

		System.out.print("Aperte o primeiro int:");
		a = input.nextInt();

		System.out.print("Aperte o segundo int:");
		b = input.nextInt();

		resultado = a * b;
		System.out.printf("A soma de todos = %d%n", resultado);

		if (resultado % 2 == 0)
			System.out.println("O primeiro é multiplo do segundo");
		
		if (resultado % 2 ==0)
			System.out.println("Par");
		
		else
			System.out.println("Impar");
		

		input.close();
	}
}
