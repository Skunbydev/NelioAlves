package estruturaRepetitiva;

import java.util.Scanner;

public class ForExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o 
		X, se for o caso.
    */ 
		
		Scanner sc = new Scanner (System.in);
		/*
		int x = sc.nextInt();
		
		for (int i = 1; i <= x; i++) {
			if (i % 2 != 0) 
				System.out.println(i);
		}
		
		*/
		
		
		/*Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
		Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando 
		essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo
		*/
		
		int N = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for (int i = 0;  i <N; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x >= 20 )
				in += 1;
			
			else 
				out += 1;
		}
		System.out.printf("dentro do in %d %n", in);
		System.out.printf("DENTRO DO out %d %n", out);
		sc.close();
	} 

}
