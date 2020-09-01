package livroDeitel;

import java.util.Scanner;

public class Ex3 {
	
	
public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
	
	System.out.print("Aperte o primeiro int");
	b = input.nextInt();
	
	System.out.print("Aperte o segundo int");
	c = input.nextInt();
	
	a = b + c ;
	System.out.printf ("Valor calculado é %d%n", a);

	}

}
