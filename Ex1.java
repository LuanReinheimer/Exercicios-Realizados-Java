package livroDeitel;

import java.util.Scanner;

public class Ex1{


	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int x;
		int y;
		int z;
		int resultado;
		
	System.out.print("Aperte o primeiro int");
	x = input.nextInt();
	
	System.out.print("Aperte o segundo int");
	y = input.nextInt();
	
	System.out.print("Aperte o terceiro int");
	z = input.nextInt();
	
	
	resultado = x * y * z;
	
	System.out.printf("O total é %d%n", resultado);
		
		
	}
	
}