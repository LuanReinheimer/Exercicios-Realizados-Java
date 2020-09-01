package course;

import java.util.Locale;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o seu numero de funcionario:");
		int funcionario = sc.nextInt();
		
		System.out.print("Informe o seu número de horas trabalhadas:");
		int hora = sc.nextInt();
		
		double fixo = 14.5;
		
		double salario = fixo * hora;

		System.out.printf("Number = %d%n", funcionario);
		System.out.printf("SALARY = U$ "+ salario);

		sc.close();

	}
}
