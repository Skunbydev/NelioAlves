package estruturaRepetitiva;

import java.util.Scanner;

public class ExercicioWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Escreva um programa que repita a leitura de uma senha até que ela seja
		 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
		 * "Senha Invalida". Quando a senha for informada corretamente deve ser impressa
		 * a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha
		 * correta é o valor 2002.
		 */

		Scanner sc = new Scanner(System.in);

		/*
		 * 
		 * do { System.out.println("Insira seu usuario:"); String usuario = sc.next();
		 * 
		 * if (usuario.equals("skunby")) { System.out.println("Insira sua senha:"); int
		 * senha = sc.nextInt(); if (senha == 2003) {
		 * System.out.println("Acesso liberado!"); break; } else
		 * System.out.println("Senha errada."); } else
		 * System.out.println("Usuário não cadastrado!");
		 * 
		 * } while (true);
		 */

		/*
		 * Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		 * indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o
		 * quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos
		 * uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
		 * alguma)
		 */
		/*
		 * System.out.println("Insira aqui os seus números:");
		 * 
		 * int x = sc.nextInt(); int y = sc.nextInt();
		 * 
		 * while (x != 0 && y != 0) { if (x > 0 && y > 0)
		 * System.out.println("primeiro quadrante"); else if (x < 0 && y > 0)
		 * System.out.println("Segundo quadrante"); else if (x < 0 && y < 0)
		 * System.out.println("Terceiro quadrante"); else
		 * System.out.println("Quarto quadrante");
		 * 
		 * x = sc.nextInt(); y = sc.nextInt(); }
		 * 
		 * /* Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de
		 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
		 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de
		 * 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa
		 * será encerrado quando o código informado for o número 4. Deve ser escrito a
		 * mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada
		 * tipo de combustível, conforme exemplo
		 */
		
		System.out.println("Por favor, coloque a forma de abastecimento:");
		System.out.println("1. Alcool 2. Gasolina 3. Diesel 4. Fim");

		int alcool = 0, gasolina = 0, diesel = 0;

		int tipo = sc.nextInt();

		while (tipo != 4) {
			if (tipo == 1) {
				System.out.println("Alcool selecionado");
				alcool += 1;
			} else if (tipo == 2) {
				System.out.println("Gasolina selecionada");
				gasolina += 1;
			} else if (tipo == 3) {
				System.out.println("Diesel selecionado");
				diesel += 1;
			} else
				System.out.println("numero invalido, por favor insira novamente.");

			tipo = sc.nextInt();

		}
		int somaTotal = alcool + gasolina + diesel;
		System.out.println("Muito obrigado pela preferencia!");
		System.out.printf("Qtd de alcool %d %n", alcool);
		System.out.printf("Qtd de gasolina %d %n", gasolina);
		System.out.printf("Qtd de diesel %d %n", diesel);
		System.out.printf("Qtd geral: %d", somaTotal);
		
		sc.close();
	}

}
