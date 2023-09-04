package estruturaRepetitiva;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		
		int soma = 0;
		while (x != 0) {
			x = sc.nextInt();
			soma += x;
		}
		System.out.printf("A soma total é de %d", soma);
		sc.close();
	}

}
