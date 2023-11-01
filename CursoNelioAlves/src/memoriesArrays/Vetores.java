package memoriesArrays;

import java.util.Locale;
import java.util.Scanner;

import entities.Products;

public class Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double[] vect = new double [n];
		
		for (int i=0; i<n; i++) {
			vect[i] = sc.nextDouble();
		} 
		
		double sum = 0.0;
		
		for(int i= 0; i<n; i++) {
			sum += vect[i];
		}
		double avg = sum / n;
		
		System.out.printf("Avarage height is: %.2f%n", avg );
		sc.close();
		*/
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Common, please insert quantity of itens bellow: ");
		int qtd = sc.nextInt();
		Products[] vect = new Products[qtd];
		
		for (int i = 0; i<qtd; i++) {
			sc.nextLine();
			System.out.println("Insert name of product: ");
			String name = sc.nextLine();
			System.out.println("Insert price of product: ");
			double price = sc.nextDouble();
			vect[i] = new Products(name, price);
		}
		double sum = 0.0;
				
				for (int i = 0; i<vect.length; i++) {
					sum += vect[i].getPrice();
				}
		
		
		double avg = sum / qtd;
		
		System.out.printf("Avarage price is: %.2f%n", avg);
		sc.close();
	}

}
