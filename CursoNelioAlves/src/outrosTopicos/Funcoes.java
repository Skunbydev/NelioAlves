package outrosTopicos;

import java.util.Scanner;

public class Funcoes {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		double y = 25.00;
		double x = Math.sqrt (y);
		
		System.out.println(x);
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter three numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		/*
		if (a > b && a > c)
			System.out.printf("%d is biggest number \n", a);
		else if (b > a && b > c)
			System.out.printf("%d is biggest number \n", b);
		else
			System.out.printf("%d is biggest number \n", c);
		*/
		
		int higher = max(a, b, c);
		
		showResult(higher);
		sc.close();

	}
	public static int max(int x, int y, int z) {
		int aux;
		
		if (x > y && x > z)
			aux = x;
		else if (y > z && y > x)
			aux = y;
		else
			aux = z;
		return aux;
	}
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
	}

}
