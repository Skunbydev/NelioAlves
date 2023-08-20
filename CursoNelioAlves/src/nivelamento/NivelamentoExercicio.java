package nivelamento;

import java.util.Locale;
import java.util.Scanner;

public class NivelamentoExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses 
//números com uma mensagem explicativa, conforme exemplos.
//		int x, y;
//		
//		Scanner sc = new Scanner (System.in);
//		
//		x = sc.nextInt();
//		y = sc.nextInt();
//		
//		int z = x + y;
//		
//		System.out.println ("A soma é igual a: " + z);
//		
//		sc.close();
		
//		Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
//		casas decimais conforme exemplos.
//		Fórmula da área: area = π . raio2
//		Considere o valor de π = 3.14159
		
//		double x, pi, area, raio;
//		Locale.setDefault(Locale.US);
//		Scanner sc = new Scanner (System.in);
//		x = sc.nextDouble(); 
//		
//		pi = 3.14159;
//		raio = x;
//		area = pi * raio * raio;
//		
//		System.out.printf("A soma do cateto é de %.4f%n", area);
//		sc.close();
		
//		Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
//		de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
//		int A, B, C, D;
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("O valor de A:");
//		A = sc.nextInt();
//		
//		System.out.println("O valor de B:");
//		B = sc.nextInt();
//		
//		System.out.println("O valor de C:");
//		C = sc.nextInt();
//		
//		System.out.println("O valor de D:");
//		D = sc.nextInt();
//		
//		int diferenca = A * B - C * D;
//		
//		System.out.printf("Diferença = " + diferenca);
//		
//		
//		sc.close();
		
//		Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
//		hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
//		decimais.
//		Locale.setDefault(Locale.US);
//		double  salary, hour, hourlyRate;
//		int employee;
//		
//		
//		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.printf("Digite o número do  funcionário: %n");
//		employee = sc.nextInt();
//		System.out.printf("Número do funcionário: %n" + employee);
//		System.out.println();
//		
//		System.out.printf ("Digite as horas trabalhadas do %d: %n", employee);
//		hour = sc.nextDouble();
//		
//		System.out.printf("Digite o valor da hora do %d: %n", employee);
//		hourlyRate = sc.nextDouble();
//		
//		System.out.printf("Calculando... 3 %n");
//		System.out.printf("Calculando... 2 %n");
//		System.out.printf("Calculando... 1 %n");
//		
//		
//		salary = hour * hourlyRate;
//		System.out.printf("O salário do funcionário %d, é de U$ : %.2f%n", employee, salary);
//		
//		
//		
//		sc.close();
		
//		Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
//		código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
//		Locale.setDefault(Locale.US);
//		
//		double peca1, peca2, valorpeca1,valorpeca2;
//		int codigopeca1,codigopeca2;
//		
//		Scanner sc = new Scanner (System.in);
//		
//		System.out.printf("Digite o código da peça1 : %n");
//		codigopeca1 = sc.nextInt();
//		System.out.printf("Digite agora, o número de peças: %n ");
//		peca1 = sc.nextDouble();
//		
//		System.out.printf("Digite o valor da peça: %n");
//		valorpeca1 = sc.nextDouble();
//		
//		System.out.printf("Digite o código da peça2 : %n");
//		codigopeca2 = sc.nextInt();
//		System.out.printf("Digite agora, o número de peças: %n ");
//		peca2 = sc.nextDouble();
//		
//		System.out.printf("Digite o valor da peça: %n");
//		valorpeca2 = sc.nextDouble();
//		
//		double somaProdutos = peca1 * valorpeca1 + peca2 * valorpeca2;
//		
//		System.out.printf("Valor A PAGAR: R$ %.2f %n", somaProdutos);
//		
//		
//		
//		
//		
//		
//		sc.close();
		
//		Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
//		mostre: 
//		a) a área do triângulo retângulo que tem A por base e C por altura. 
//		b) a área do círculo de raio C. (pi = 3.14159) 
//		c) a área do trapézio que tem A e B por bases e C por altura. 
//		d) a área do quadrado que tem lado B. 
//		e) a área do retângulo que tem lados A e B
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
				
		
		sc.close();
	}

}
