//01 - Faça um programa que receba três inteiros e diga qual deles é o maior.
package lacosCondicionais;

import java.util.Scanner;

public class AtividadeLC01 {

	public static void main(String[] args) {

		Scanner	leia = new Scanner(System.in);
		
		int a, b, c, maior;
		
		System.out.println("Digite três números:");
		System.out.println("Número 01: ");
		a = leia.nextInt();
		
		System.out.println("Número 02: ");
		b = leia.nextInt();
		
		System.out.println("Numero 03: ");
		c = leia.nextInt();
		
		if(a>b && a>c) {
			maior = a;
		}
		
		else if(b>a && b>c) {
			maior = b;
		}
		
		else {
			maior = c;			
		}
		
		System.out.println("O maior número é o " + maior);

	}

}
