package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Locale.setDefault(Locale.US);
		char resp;
		
		
		do  {
			System.out.println("Digite a temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C / 5.0 + 32.00;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
			System.out.print("Deseja repetir (s/n)? \n");
			resp = sc.next().charAt(0);	
			
		}
		while (resp != 'n');
		System.out.println("Aplicação encerrada");
		sc.close();
		
		}
	}
