package livroDeitel;

import java.util.Scanner;

public class Ex5 {
	
public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		int i;
		int j;
		int k;
		int p;
		
	System.out.print("Aperte o primeiro int");
	i = input.nextInt();
	
	System.out.print("Aperte o segundo int");
	j = input.nextInt();
	
	System.out.print("Aperte o terceiro int");
	k = input.nextInt();
	
	
	p = i + j + k + 7;
	
	System.out.printf(" variables whose values are modified %d%n", p);


	}
}