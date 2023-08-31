package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
		
		// int Numero = sc.nextInt();
//		
//		
//		if (Numero > 0) 
//			System.out.println("Positivo");
//		else 
//			System.out.println("Número negativo");
		
		// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar
		
//		if (Numero % 2 == 0) 
//			System.out.println("Par");
//		 else 
//			System.out.println("Ímpar");
		// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao 
//		Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 
//		ordem crescente ou decrescente
		
		
		/*
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A % B == 0 || B % A == 0)
			System.out.println("Múltiplo");
		else 
			System.out.println("Não múltiplo");
		
		*/ 
		
		/* 
		 * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode 
		 * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		 */
		
		/*
		int horaInicial = sc.nextInt();
		int horaFinal = sc.nextInt();
		
		int duracao;
		if (horaInicial < horaFinal)
			duracao = horaFinal - horaInicial;
		else
			duracao = 24 - horaInicial + horaFinal;
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		*/
		
		
		/* 
		 * Com base na tabela abaixo, escreva um programa que leia o
		 * código de um item e a quantidade deste item. A 
		 * seguir, calcule e mostre o valor da conta a pagar.
		*/
		
		/*
		System.out.println("Bem vindo a minha lanchonete, amigo.");
		System.out.println("Quais o seu lanche?");
		System.out.println("1. - Cachorro quente, R$: 4.00");
		System.out.println("2. - X-Salada, R$: 4.50");
		System.out.println("3. - X-Bacon, R$: 5.00");
		System.out.println("4. - Torrada simples, R$ 2.00");
		System.out.println("5. - Refrigerante, R$: 1.50");
		
		
		System.out.println("Insira o código do seu lanche:");
		int codLanche = sc.nextInt();
		
		System.out.println("Insira agora, quantos lanches você quer:");
		int quantidade = sc.nextInt();
		
		String nomeLanche;
		double valorTotal = 0;
		
		switch (codLanche) {
		case 1:
			nomeLanche = "Cachorro-quente(S)";
			valorTotal = quantidade * 4.00;
		break;
		case 2:
			nomeLanche = "X-Salada(S)";
			valorTotal = quantidade * 4.50;
		break;
		case 3:
			nomeLanche = "X-Bacon(S)";
			valorTotal = quantidade * 5.00;
		break;
		case 4:
			nomeLanche = "Torrada(S)-Simples";
			valorTotal = quantidade * 2.00;
		break;
		case 5:
			nomeLanche = "Refrigerante";
			valorTotal = quantidade * 1.50;
		default: 
			nomeLanche = "Inválido";
			valorTotal = 0;
		}
		
		System.out.printf("%d %S com o preço de %.2f ", quantidade, nomeLanche, valorTotal);
		*/
		
		/* Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem
		 * dizendo em qual dos seguintes intervalos s ([0,25], (25,50], (50,75], (75,100]) este valor se encontra
		 *Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”
		 */
		
		/*
		double x = sc.nextDouble();
		
		if (x < 0.00 || x > 100)
			System.out.println("Fora de intervalo");
		else if (x <= 25) 
			System.out.println("intervalo [0,25]");
		else if (x <= 50)
			System.out.println("intervalo [25,50]");
		else if (x <=75)
			System.out.println("intervalo [50,75]");
		else if (x <=100)
			System.out.println("intervalo [75,100]");
		
		*/ 
		
		/*Em um país imaginário denominado Lisarb, todos os habitantes ficam felizes em pagar seus impostos, pois sabem 
		que nele não existem políticos corruptos e os recursos arrecadados são utilizados em benefício da população, sem 
		qualquer desvio. A moeda deste país é o Rombus, cujo símbolo é o R$.
		Leia um valor com duas casas decimais, equivalente ao salário de uma pessoa de Lisarb. Em seguida, calcule e 
		mostre o valor que esta pessoa deve pagar de Imposto de Renda, segundo a tabela abaixo */
		
		Locale.setDefault(Locale.US);
		
		double salario = sc.nextDouble();
		
		double imposto = 0;
		
		if (salario <= 2000)
			imposto = 0.00;
		else if (salario <= 3000)
			imposto = (salario - 2000) * 0.08;
		else if (salario <= 4500)
			imposto = (salario - 3000) * 0.18 + 1000.00 * 0.08;
		else 
			imposto = (salario - 4500) * 0.28 + 1500.00 * 0.18 + 1000 * 0.8;
		
		if (imposto == 0.00)
			System.out.println("Insento");
		else 
			System.out.printf("R$ %.2f%n", imposto);
		
		sc.close();
	}

}
