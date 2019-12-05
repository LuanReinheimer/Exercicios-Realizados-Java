package livroDeitel;

import java.util.Scanner;

public class Ex9 {
	
	public static void main(String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	
	int a;
	int b;
	int resultado1;
	int resultado2;
	int resultado3;
	int resultado4;
	
System.out.print("Aperte o primeiro int");
b = input.nextInt();

System.out.print("Aperte o segundo int");
a = input.nextInt();



resultado1 = a + b ;

resultado2 = b * a;

resultado3 = a - b;

resultado4 = b / a;



System.out.printf("A soma é %d%n", resultado1);
System.out.printf("O produto é %d%n", resultado2);
System.out.printf("A diferença é %d%n", resultado3);
System.out.printf("O quociente é %d%n", resultado4);


	}
}
