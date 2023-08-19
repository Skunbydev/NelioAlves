package estruturasSequenciais;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // String
//		Scanner sc = new Scanner(System.in);
//		String x;
//		x = sc.next();
//        System.out.println ("Você digitou:" + x);
//		sc.close();
		
		// Número inteiro
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner (System.in);
//		int x;
//		x = sc.nextInt(); //double, serve pro flutuante.
//		System.out.println ("Você digitou:" +x);
//		sc.close();
		
		// Caracteres
//		Scanner sc = new Scanner (System.in);
//		char x;
//		x = sc.next().charAt(0);
//		System.out.println("Você digitou: " +x);
		
		// Vários dados
		Locale.setDefault(Locale.US);
		String x;
		double z;
		int y;
		
		Scanner sc = new Scanner (System.in);
		
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		
		System.out.println("Você digitou corretamente? ");
		System.out.println("Seu nome: " + x);
		System.out.println("Sua idade " + y);
		System.out.println("Sua altura " + z);
		
		sc.close();
		

	}

}
