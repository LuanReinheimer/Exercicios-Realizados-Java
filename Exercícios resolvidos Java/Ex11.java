package livroDeitel;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int a;
		int b;
		int c;
		int resultado;
		int resultado2;
		int média;

		System.out.print("Aperte o primeiro int");
		a = input.nextInt();

		System.out.print("Aperte o segundo int");
		b = input.nextInt();

		System.out.print("Aperte o terceiro int");
		c = input.nextInt();

		resultado = a + b + c;
		System.out.printf("A soma de todos = %d%n", resultado);

		resultado2 = a * b * c;
		System.out.printf("O produto = %d%n", resultado2);

		média = (a + b + c) / 3;
		System.out.printf("A média = %d%n", média);

		if (a < b)
			System.out.printf("%d menor que %d%n", a, b);

		if (a > c)
			System.out.printf("%d maior que %d%n", a, c);

		if (b < a)
			System.out.printf("%d menor que %d%n", b, a);

		if (b > c)
			System.out.printf("%d maior que %d%n", b, c);

		if (c < a)
			System.out.printf("%d menor que %d%n", c, a);

		if (c > b)
			System.out.printf("%d maior que %d%n", c, b);

	}
}