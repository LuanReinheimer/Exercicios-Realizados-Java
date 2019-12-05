package livroDeitel;

import java.util.Scanner;

public class Ex16 {

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);

		int raio;

		double diametro;
		double circunferencia; 
		double area;

		System.out.print("Digite o valor do raio da Circunferencia:");

		raio = input.nextInt();

		diametro = 2 * raio;

		circunferencia = 2 * Math.PI * raio;

		area = Math.PI * (raio * raio);

		System.out.printf("Diametro: %f\n", diametro);
		System.out.printf("Circunferencia: %f\n",circunferencia);
		System.out.printf("area: %f\n",area);

	}

}
