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
	System.out.printf("O segundo N� � menor que o primeiro N�. ");

if (a > b)
	System.out.printf("O primeiro N� � menor que o segundo N�. ");

if (a == b)
	System.out.printf("Ambos os N� s�o igual");

	}
}

