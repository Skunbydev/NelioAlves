package nivelamento;

import java.util.Scanner;

public class NivelamentoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses 
//números com uma mensagem explicativa, conforme exemplos.
		int x, y;
		
		Scanner sc = new Scanner (System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		
		int z = x + y;
		
		System.out.println ("A soma é igual a: " + z);
		
		sc.close();
		
	}

}
