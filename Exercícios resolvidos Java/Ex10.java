package livroDeitel;

import java.util.Scanner;

public class Ex10 {
	
	public static void main(String[] args) {
		
		
	Scanner input = new Scanner(System.in);
	
	int a;
	int b;
	
System.out.print("Aperte o primeiro int");
b = input.nextInt();

System.out.print("Aperte o segundo int");
a = input.nextInt();

if (a < b)	
	System.out.printf("O segundo Nº é menor que o primeiro Nº. ");

if (a > b)
	System.out.printf("O primeiro Nº é menor que o segundo Nº. ");

if (a == b)
	System.out.printf("Ambos os Nº são igual");

	}
}

