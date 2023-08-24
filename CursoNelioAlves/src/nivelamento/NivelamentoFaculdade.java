package nivelamento;

import java.util.Locale;
import java.util.Scanner;

public class NivelamentoFaculdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Desenvolva um algoritmo para receber um número do usuário e verificar se 
		esse número é maior do que 100. Se for, o algoritmo deverá somar 150 a 
		esse número e ao final, o resultado final deverá ser mostrado.
   */ 
		Scanner sc = new Scanner (System.in);
		
		// %S = string
		// %D = inteiro
		// %f = flutuante (numero com ponto [US] ou virgula [BR])
		/*
		int N;
		int somaNumero = 150;
		
		
		System.out.println("Digite o número abaixo:");
		
		N = sc.nextInt();
		
		if (N <= 100)
			System.out.printf("O resultado da sua soma é: %d %n", N);
		else 
			System.out.printf("O resultado da sua soma é: %d %n", (N + somaNumero));
		*/
		
	   /* Desenvolva um algoritmo para receber dois números e verificar qual é o
		menor e qual é o maior.
		*/ 
		
		
	/*	int nX;
		int nY;
		
		System.out.println("Check numbers below, pls enter the numbers:");
		
		nX = sc.nextInt();
		System.out.println("That's so good, pls enter next number below:");
		nY = sc.nextInt();
		
		if (nX > nY) 
			System.out.printf("This %d is biggest %n", nX);
		else 
			System.out.printf("This %d is biggest %n", nY);
		
		*/
		
		/* 
		 * Desenvolva um algoritmo que leia o nome e a altura de duas pessoas e ao
			final, imprima o nome da pessoa mais alta. * 
		 */
		
		/*
		String herName;
		double herHeight;
		String sheName;
		double sheHeight;
		Locale.setDefault (Locale.US);
		System.out.println("Insert her name");
		
		herName = sc.nextLine();
		
		System.out.println("That is so fine, insert her height:");
		herHeight = sc.nextDouble();
		
		System.out.println("Now, she name");
		sheName = sc.next();
		
		System.out.println("That is so fine, insert she height:");
		sheHeight = sc.nextDouble();
		
		
		if (herHeight > sheHeight) 
			System.out.printf("%s is taller %n", herName);
		
		else 
			System.out.printf("%s is taller %n", sheName);
			 
		*/
		
		/* 
		 *  Desenvolva um algoritmo que leia o ano de nascimento de duas pessoas e
			calcule suas idades. Ao final, imprima o nome e a idade da pessoa mais
			nova. 
		 */ 
		
		
		/*
		int yearHer;
		int yearShe;
		
		int actualYear; 
		
		String herName;
		String sheName;
		
		System.out.println("Please, insert bellow acctualy year:");
		actualYear = sc.nextInt();
		
		
		System.out.println("Please, insert her year of birthday");
		yearHer = sc.nextInt();
		
		System.out.println("Please, now insert she year of birthday");
		yearShe = sc.nextInt();
		sc.nextLine(); 
		
		System.out.println("What's her name?");
		herName = sc.nextLine();
		
		System.out.println("What's she name?");
		sheName = sc.nextLine();
		
		System.out.println("calculando...");
		
		
		  if (yearHer < yearShe) {
            System.out.printf("%s is older%n", herName);
            System.out.printf("%s is %d years older%n", herName, (actualYear - yearHer));

        } else if (yearShe < yearHer) {
            System.out.printf("%s is older%n", sheName);
            System.out.printf("%s is %d years older%n", sheName, (actualYear - yearShe));

        } else {
            System.out.println("They are the same age");
        }
		*/ 
		
		/* 
		 * Desenvolva um algoritmo que receba dois valores numéricos do usuário e ao
		 * final, mostre a diferença do maior valor para o menor.
		 */
		
		int nX;
		int nY;
		
		System.out.println("Enter the first number:");
		nX = sc.nextInt();
		
		System.out.println("Enter second number");
		nY = sc.nextInt();
		
		if (nX > nY) 
			System.out.print(nX - nY);
		else if (nY > nX)
			System.out.printf("difference:   nY - nX);
		sc.close();
}
}
