package nivelamento;

import java.util.Locale;
import java.util.Scanner;

public class NivelamentoFaculdade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Desenvolva um algoritmo para receber um número do usuário e verificar se 
		esse número é maior do que 100. Se for, o algoritmo deverá somar 150 a 
		esse número e ao final, o resultado final deverá ser mostrado.
   */ 
		Scanner sc = new Scanner (System.in);
		
		// %S = string
		// %D = inteiro
		// %f = flutuante (numero com ponto [US] ou virgula [BR])
		/*
		int N;
		int somaNumero = 150;
		
		
		System.out.println("Digite o número abaixo:");
		
		N = sc.nextInt();
		
		if (N <= 100)
			System.out.printf("O resultado da sua soma é: %d %n", N);
		else 
			System.out.printf("O resultado da sua soma é: %d %n", (N + somaNumero));
		*/
		
	   /* Desenvolva um algoritmo para receber dois números e verificar qual é o
		menor e qual é o maior.
		*/ 
		
		
	/*	int nX;
		int nY;
		
		System.out.println("Check numbers below, pls enter the numbers:");
		
		nX = sc.nextInt();
		System.out.println("That's so good, pls enter next number below:");
		nY = sc.nextInt();
		
		if (nX > nY) 
			System.out.printf("This %d is biggest %n", nX);
		else 
			System.out.printf("This %d is biggest %n", nY);
		
		*/
		
		/* 
		 * Desenvolva um algoritmo que leia o nome e a altura de duas pessoas e ao
			final, imprima o nome da pessoa mais alta. * 
		 */
		
		/*
		String herName;
		double herHeight;
		String sheName;
		double sheHeight;
		Locale.setDefault (Locale.US);
		System.out.println("Insert her name");
		
		herName = sc.nextLine();
		
		System.out.println("That is so fine, insert her height:");
		herHeight = sc.nextDouble();
		
		System.out.println("Now, she name");
		sheName = sc.next();
		
		System.out.println("That is so fine, insert she height:");
		sheHeight = sc.nextDouble();
		
		
		if (herHeight > sheHeight) 
			System.out.printf("%s is taller %n", herName);
		
		else 
			System.out.printf("%s is taller %n", sheName);
			 
		*/
		
		/* 
		 *  Desenvolva um algoritmo que leia o ano de nascimento de duas pessoas e
			calcule suas idades. Ao final, imprima o nome e a idade da pessoa mais
			nova. 
		 */ 
		
		
		/*
		int yearHer;
		int yearShe;
		
		int actualYear; 
		
		String herName;
		String sheName;
		
		System.out.println("Please, insert bellow acctualy year:");
		actualYear = sc.nextInt();
		
		
		System.out.println("Please, insert her year of birthday");
		yearHer = sc.nextInt();
		
		System.out.println("Please, now insert she year of birthday");
		yearShe = sc.nextInt();
		sc.nextLine(); 
		
		System.out.println("What's her name?");
		herName = sc.nextLine();
		
		System.out.println("What's she name?");
		sheName = sc.nextLine();
		
		System.out.println("calculando...");
		
		
		  if (yearHer < yearShe) {
            System.out.printf("%s is older%n", herName);
            System.out.printf("%s is %d years older%n", herName, (actualYear - yearHer));

        } else if (yearShe < yearHer) {
            System.out.printf("%s is older%n", sheName);
            System.out.printf("%s is %d years older%n", sheName, (actualYear - yearShe));

        } else {
            System.out.println("They are the same age");
        }
		*/ 
		
		/* 
		 * Desenvolva um algoritmo que receba dois valores numéricos do usuário e ao
		 * final, mostre a diferença do maior valor para o menor.
		 */
		
		/* int nX;
		int nY;
		
		System.out.println("Enter the first number:");
		nX = sc.nextInt();
		
		System.out.println("Enter second number");
		nY = sc.nextInt();
		
		if (nX > nY) 
			System.out.printf("%d is higgest, difference: %d", nX, (nX - nY));
		else if (nY > nX)
			System.out.printf("%d is higgest, difference: %d", nY, (nY - nX));
		else 
			System.out.printf("same numbers");
		*/ 
		
		/* Desenvolva um algoritmo que receba um número e escreva a mensagem
         * VALOR POSITIVO caso o número seja igual ou maior que zero e escreva a
         * mensagem VALOR NEGATIVO caso o número seja menor do que zero. 
		*/
		
	 /*	double n;
		
		System.out.printf("Please insert number bellow: ");
		
		n = sc.nextDouble();
		
		if (n >= 0) 
			System.out.printf("Numero positivo");
		else 
			System.out.printf("Numero negativo");
	*/
		
		/* Desenvolva um algoritmo que leia o sexo (M ou F) e a altura de uma pessoa
		 * e imprima o peso ideal. (GUIMARÃES; LAGES, 1994).
         * Dados:
         * ○ Peso ideal para o sexo masculino: altura (cm) * 0.95 – 95
         * ○ Peso ideal para o sexo feminino: altura (cm) * 0.85 – 85
		 * 
		 */
		
		/*
		
		System.out.print("Enter you gender (M/F): ");
		char gender = sc.next().charAt(0);
		
		Locale.setDefault(Locale.US); 
		System.out.println("Enter you height in cm");
		String heightStr = sc.next();
        double height = Double.parseDouble(heightStr);
		
		double idealWeight = 0;
		
		if (gender == 'M' || gender == 'm') {
			idealWeight = height * 0.95 - 95;
		} else if (gender =='F' || gender == 'f') {
			idealWeight = height * 0.85 - 85;
		} else 
			System.out.println("Meu parceiro, provavelmente voce eh um robo");
			
		System.out.printf("Your ideal weight is: %.2f kg%n", idealWeight);
		*/
		
		/* Desenvolva um algoritmo que leia uma letra. Se a letra for uma vogal,
		 * imprimir a mensagem “VOGAL”, caso contrário, imprimir a mensagem
         * “CONSOANTE”. 
		 */
		
		
		
	/*	System.out.println("eae comparsa, bem vindo ao verificador de vogais/consoantes. ");
		System.out.println("Por favor, insira a baixo a porra da sua letra: ");
				
		char vogais = sc.next().charAt(0);
		
		if (vogais == 'a' ||vogais == 'A' || vogais == 'e' || vogais == 'E' || vogais == 'i' || vogais == 'I' || vogais == 'o' || vogais == 'O' || vogais =='u' || vogais =='U')
			 System.out.printf("é uma vogal");
		else 
			System.out.printf("É consoante, burro");
		*/
		
		
	/* Desenvolva um algoritmo para ler duas notas de um aluno e calcular a sua
     * média. Após o cálculo, verifique a situação do aluno de acordo com os
	 * critérios abaixo:
       ● Se a média aritmética das notas for maior ou igual a 7,0, deve ser
         apresentada a mensagem ALUNO ESTÁ APROVADO;
       ● Se a média for maior ou igual a 5,0 e menor do que 7,0, deve aparecer a
         mensagem ALUNO ESTÁ EM RECUPERAÇÃO;
       ● Se a média for menor do que 5,0, deve aparecer a mensagem ALUNO ESTÁ REPROVADO.
	 * 	
	 */
	/*	double nota1;
		double nota2;
		
		
		
		System.out.println("Bem vindo ao sistema escolar");
		System.out.println("Insira abaixo, a nota do aluno: ");
		
		nota1 = sc.nextDouble();
		
		
		System.out.println("Insira abaixo, a segunda nota do aluno: ");
		nota2 = sc.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		
		System.out.println("Calculando, aguarde...");
		
		if (media >= 7)
		 System.out.printf("Eita, aprovado!!!");
		 
		else if (media >= 5)
		 System.out.printf("Eita, recuperação!!!");
		
		else 
		 System.out.printf("Parabéns burrinho, vai ter que fazer tudo dnv");
		 
	*/
		
		/* 
		 * Escreva um algoritmo que leia três valores inteiros e diferentes e mostre-os
		    em ordem decrescente. */
		
		
        int n1, n2, n3;
        
        System.out.println("Bem vindo ao meu programa, por gentileza... Digite três números");
        System.out.println("Insira o primeiro número:");
        n1 = sc.nextInt();
        
        System.out.println("Insira o segundo número:");
        n2 = sc.nextInt();
        
        System.out.println("Insira o terceiro número:");
        n3 = sc.nextInt();
        
        int maior, meio, menor;
        
        if (n1 > n2 && n1 > n3) {
            maior = n1;
            if (n2 > n3){
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        } else if (n2 > n1 && n2 > n3) {
            maior = n2;
            if (n1 > n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        } else {
            maior = n3;
            if (n1 > n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }
        
        System.out.printf("Em ordem descrecente o menor número é %d, o segundo menor é %d, o maior é %d", menor, meio, maior);
        
        sc.close();
    }


		
}

