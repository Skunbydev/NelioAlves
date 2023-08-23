package nivelamento;

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
		
		int N;
		int NumberAdction = 150;
		System.out.println("Insira aqui o número: ");
		
		N = sc.nextInt();
		
		if (N >= 100) 
		 System.out.println("O resultado é:" + (NumberAdction + N));
		else 
		 System.out.printf("O resultado é: %d", N);
		
		
		sc.close();	

}
}
