package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ForExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
		 * até X, um valor por linha, inclusive o X, se for o caso.
		 */

		Scanner sc = new Scanner(System.in);
		/*
		 * int x = sc.nextInt();
		 * 
		 * for (int i = 1; i <= x; i++) { if (i % 2 != 0) System.out.println(i); }
		 * 
		 */

		/*
		 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X
		 * que serão lidos em seguida. Mostre quantos destes valores X estão dentro do
		 * intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
		 * informações conforme exemplo (use a palavra "in" para dentro do intervalo, e
		 * "out" para fora do intervalo
		 */
		/*
		 * int N = sc.nextInt();
		 * 
		 * int in = 0; int out = 0;
		 * 
		 * for (int i = 0; i <N; i++) { int x = sc.nextInt(); if (x >= 10 && x >= 20 )
		 * in += 1;
		 * 
		 * else out += 1; } System.out.printf("dentro do in %d %n", in);
		 * System.out.printf("DENTRO DO out %d %n", out);
		 */
		/*
		 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
		 * seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
		 * casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
		 * valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e
		 * o terceiro valor tem peso 5
		 */
		/*
		 * int n = sc.nextInt();
		 * 
		 * for (int i = 0; i < n; i++) { double A = sc.nextDouble(); double B =
		 * sc.nextDouble(); double C = sc.nextDouble();
		 * 
		 * double MediaTotal = (A * 2 + B * 3 + C * 5) / 10;
		 * 
		 * System.out.printf("%.1f%n", MediaTotal); }
		 */

		/*
		 * Fazer um programa para ler um número N. Depois leia N pares de números e
		 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero,
		 * mostrar a mensagem "divisao impossivel"
		 */
		
		/*
		Locale.setDefault(Locale.US);
		int N = sc.nextInt();
		double divisao = 0;
		for (int i = 0; i < N; i++) {
			System.out.println("Coloque aqui o divisor:");
			double divisor = sc.nextDouble();
			System.out.println("Coloque aqui o denominador:");
			double denominador = sc.nextDouble();

			if (denominador == 0)
				System.out.println("Divisao impossivel");
			else
				divisao = divisor / denominador;
			System.out.printf("%.1f%n", divisao);
		}
		*/
		
		
		/* Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
        Lembrando que, por definição, fatorial de 0 é 1
		*/
		
		/*
		int N = sc.nextInt();
		int fat = 1;
		
		for (int i = 1; i <= N; i++) {
			fat *= i;
		}
		System.out.println(fat);
		
		*/
		
		/*
		 * Ler um número inteiro N e calcular todos os seus divisores
		 */
		
		/* 
		int N = sc.nextInt();
		
		 
		for (int i = 1;  i <= N; i++) {
			if (N % i == 0)
				System.out.println(i);
			
		}
		*/ 
		
		
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++ ) {
			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			
			System.out.println(primeiro + segundo + terceiro);
		}
		sc.close();
	}

}
