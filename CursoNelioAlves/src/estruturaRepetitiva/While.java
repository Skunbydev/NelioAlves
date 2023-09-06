package estruturaRepetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		
		int soma = 0;
		
		int x = sc.nextInt();
		
		while (x != 0) {
			soma += x;
			x = sc.nextInt();
		}
		
		
		System.out.printf("A soma total dos seus números é: %d", soma);
		
		
		sc.close();
	}

}
