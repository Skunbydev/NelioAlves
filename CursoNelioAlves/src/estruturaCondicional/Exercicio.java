package estruturaCondicional;

import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		// int Numero = sc.nextInt();
//		
//		
//		if (Numero > 0) 
//			System.out.println("Positivo");
//		else 
//			System.out.println("Número negativo");
		
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
//		if (Numero % 2 == 0) 
//			System.out.println("Par");
//		 else 
//			System.out.println("Ímpar");
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
//		ordem crescente ou decrescente
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0)
			System.out.println("Múltiplo");
		else 
			System.out.println("Não múltiplo");
		
		sc.close();
	}

}
