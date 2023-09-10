package estruturaRepetitiva;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Fazer um programa que lê um valor inteiro N
		 * e depois N números inteiros. Ao final, mostra a soma
		 *  dos numeros lidos.
		 */
		
		Scanner sc = new Scanner (System.in);
		/*
		
		
		int N = sc.nextInt();
		int soma = 0;
		for (int i = 0; i <N;  i = i+1) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		
		*/
		/*
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma += x;
		}
		System.out.println(soma);
		*/
		/*
		 * contagem regreesiva 
		 */
		
		for (int i = 10; i >= 0; i--) {
			System.out.println("Valor de i: "+i);
			
		}
		sc.close();
	}

}
