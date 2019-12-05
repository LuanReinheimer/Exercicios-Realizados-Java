package livroDeitel;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite uma Int:");

		int a = sc.nextInt();

		if (a % 2 == 0)
			System.out.println("Par");

		else

			System.out.println("Impar");

		sc.close();
	}
}
