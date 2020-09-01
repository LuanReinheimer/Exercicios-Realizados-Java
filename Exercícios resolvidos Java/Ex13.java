package livroDeitel;

import java.util.Scanner;

public class Ex13 {
	
	public static void main(String[] args) {
		
	
		Scanner input = new Scanner( System.in );

		int a; 
		int b; 
		int c; 
		int d; 
		int e; 
		int Maior;
		int Menor;
		
		System.out.print( "Enter first integer: " ); 
		a = input.nextInt(); 
		
		System.out.print( "Enter second integer: " ); 
		b = input.nextInt(); 
		
		System.out.print( "Enter second integer: " ); 
		c = input.nextInt(); 
		
		System.out.print( "Enter second integer: " ); 
		d = input.nextInt(); 
		
		System.out.print( "Enter second integer: " ); 
		e = input.nextInt(); 
		
		Maior = -1000000;
		Menor = 1000000;
		
		
		if ( a > Maior){
			Maior = a;
		}
		if ( a < Menor ){
			Menor = a;
		}
		if ( b > Maior ){
			Maior = b;
		}
		if ( b < Menor ){
			Menor = b;
		}
		if ( c > Maior ){
			Maior = c;
		}
		if ( c < Menor ){
			Menor = c;
		}
		if ( d > Maior ){
			Maior = d;
		}
		if ( d < Menor ){
			Menor = d;
		}
		if ( e > Maior ){
			Maior = e;
		}
		if ( e < Menor ){
			Menor = e;
		}

		
		System.out.printf("O Maior:%d\n ", Maior );
		System.out.printf("O Menor:%d\n ", Menor );
		
		
	}
	

}
